package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.MedicationOrder;
import com.csra.utility.fhir.FhirUtility;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@EnableSwagger2
@RequestMapping("/fhir")
public class MedicationOrderController extends RootController {

    static Logger log = LoggerFactory.getLogger(MedicationOrderController.class.getName());

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
            Bundle bundle = prescriptionService.getMedicationOrdersForPatient(patient);
            if (bundle.getEntry().size() > 0) {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(bundle), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirUtility.createOperationOutcome("No prescriptions found!",
                        IssueTypeList.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }
        } catch (JsonProcessingException e) {
            log.error("{}!", e.getMessage());
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
            MedicationOrder medicationOrder = prescriptionService.getMedicationOrderFromPrescription(ien);

            if (medicationOrder != null) {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(medicationOrder), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirUtility.createOperationOutcome("No prescription found!",
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

            prescriptionService.createPrescription(medicationOrder);

        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirUtility.createOperationOutcome(e.getMessage(),
                    IssueTypeList.EXCEPTION)), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }
}
