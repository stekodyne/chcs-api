package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.MedicationOrder;
import com.csra.mapstruct.mapper.LegacyPatientMapper;
import com.csra.mapstruct.mapper.LegacyPrescriptionMapper;
import com.csra.mapstruct.mapper.PrescriptionMapper;
import com.csra.model.Drug;
import com.csra.model.Patient;
import com.csra.model.Prescription;
import com.csra.model.Provider;
import com.csra.repository.DrugRepository;
import com.csra.repository.PatientRepository;
import com.csra.repository.PrescriptionRepository;
import com.csra.repository.ProviderRepository;
import com.csra.utility.OperationOutcomeGenerator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intersys.classes.ArrayOfDataTypes;
import com.qbase.legacy.api.repository.IRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@EnableSwagger2
@RequestMapping("/fhir")
public class MedicationOrderController extends RootController {

    static Logger log = LoggerFactory.getLogger(MedicationOrderController.class.getName());

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Autowired
    private DrugRepository drugRepository;

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PrescriptionMapper prescriptionMapper;

    @Autowired
    protected IRepository chcsRepository;

    @Autowired
    private LegacyPatientMapper legacyPatientMapper;

    @Autowired
    private LegacyPrescriptionMapper legacyPrescriptionMapper;

    @ApiOperation(value = "findAllByPatient", nickname = "findAllByPatient")
    @RequestMapping(method = RequestMethod.GET, path="/MedicationOrder", produces = "application/json+fhir")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "patient", value = "Patient's IEN", required = true, dataType = "string", paramType = "query", defaultValue="67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Bundle.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAllByPatient(@RequestParam String patient) {
        ResponseEntity<String> response = null;

        try {
            List<Prescription> prescriptions = prescriptionRepository.findAllByPatient(patient);
            if (prescriptions.size() > 0) {
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                Bundle bundle = prescriptionMapper.prescriptionsToFhirBundle(prescriptions);
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(bundle), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(OperationOutcomeGenerator.generate("No prescriptions found!",
                        IssueTypeList.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "findByIen", nickname = "findByIen")
    @RequestMapping(method = RequestMethod.GET, path="/MedicationOrder/{ien}", produces = "application/json+fhir")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ien", value = "Medications's IEN", required = true, dataType = "string", paramType = "path", defaultValue="67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = MedicationOrder.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findByIen(@PathVariable String ien) {
        ResponseEntity<String> response = null;

        try {
            Prescription prescription = prescriptionRepository.findByIen(ien);

            if (prescription != null) {
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                MedicationOrder medicationOrder = prescriptionMapper.prescriptionToFhirMedicationOrder(prescription);
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(medicationOrder), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(OperationOutcomeGenerator.generate("No prescription found!",
                        IssueTypeList.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "createMedicationOrder", nickname = "createMedicationOrder")
    @RequestMapping(method = RequestMethod.POST, path="/MedicationOrder", produces = "application/json+fhir")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "medicationOrder", value = "FHIR MedicationOrder", required = true, dataType = "string", paramType = "body", defaultValue="")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> createMedicationOrder(@RequestBody MedicationOrder medicationOrder) throws Exception {
        ResponseEntity<String> response = null;

        try {

            if(medicationOrder == null) {
                throw new Exception("MedicationOrder was null!");
            }

            Prescription prescription = prescriptionMapper.prescriptionFromFhirMedicationOrder(medicationOrder);
            Drug drug = drugRepository.findByIen(prescription.getDrug());
            Provider provider = providerRepository.findByIen(prescription.getProvider());
            Patient patient = patientRepository.findByIen(prescription.getPatient());

            log.debug("Patient: {}", patient);

            if (patient == null || provider == null) {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(OperationOutcomeGenerator.generate("Drug or Provider are missing or incomplete!",
                        IssueTypeList.INCOMPLETE)), HttpStatus.NOT_FOUND);
            } else {
                com.qbase.legacy.api.dao.Patient legacyPatient = legacyPatientMapper.patientToLegacyPatient(patient);

                log.debug("Legacy Patient: {}", legacyPatient);

                com.qbase.legacy.api.dao.Prescription legacyPrescription = legacyPrescriptionMapper.prescriptionToLegacyPrescription(prescription, drug, provider);

                log.debug("Legacy Prescription: {}", legacyPrescription);

                ArrayOfDataTypes errors = chcsRepository.savePrescription(legacyPatient, legacyPrescription);

                log.debug("Errors: {}", errors);

                if (errors == null) {
                    response = new ResponseEntity<String>(HttpStatus.CREATED);
                } else {
                    response = new ResponseEntity<String>(errors.toString(), HttpStatus.BAD_REQUEST);
                }
            }

        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }
}
