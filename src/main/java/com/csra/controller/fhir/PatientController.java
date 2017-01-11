package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.Patient;
import com.csra.mapstruct.mapper.PatientMapper;
import com.csra.repository.PatientRepository;
import com.csra.utility.fhir.FhirUtility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@EnableSwagger2
@RequestMapping("/fhir")
public class PatientController extends RootController {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientMapper patientMapper;

    @ApiOperation(value = "findAll", nickname = "findAll")
    @RequestMapping(method = RequestMethod.GET, path = "/Patient", produces = "application/json+fhir")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Bundle.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAll() {
        ResponseEntity<String> response = null;

        try {
            List<com.csra.model.Patient> patients = patientRepository.findAll();

            if (patients.size() > 0) {
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                Bundle bundle = patientMapper.patientsToFhirBundle(patients);
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(bundle), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirUtility.createOperationOutcome("No patients found!",
                        IssueTypeList.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "findByIen", nickname = "findByIen")
    @RequestMapping(method = RequestMethod.GET, path = "/Patient/{ien}", produces = "application/json+fhir")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ien", value = "Patient's IEN", required = true, dataType = "string", paramType = "path", defaultValue = "67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Patient.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findByIen(@PathVariable String ien) {
        ResponseEntity<String> response = null;

        try {
            com.csra.model.Patient p = patientRepository.findByIen(ien);
            if (p != null) {
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                Patient patient = patientMapper.patientToFhirPatient(p);
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(patient), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirUtility.createOperationOutcome("No patient found!",
                        IssueTypeList.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

}
