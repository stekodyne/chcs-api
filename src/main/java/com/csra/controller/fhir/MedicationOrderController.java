package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.fhir.MedicationOrder;
import com.csra.mapstruct.mapper.PrescriptionMapper;
import com.csra.repository.PrescriptionRepository;
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

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Autowired
    private PrescriptionMapper prescriptionMapper;

    @ApiOperation(value = "findAllByPatient", nickname = "findAllByPatient")
    @RequestMapping(method = RequestMethod.GET, path="/MedicationOrder", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "patient", value = "Patient's IEN", required = true, dataType = "string", paramType = "query", defaultValue="67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Object.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAllByPatient(@RequestParam String patient) {
        ResponseEntity<String> response = null;

        try {
            Bundle bundle = prescriptionMapper.prescriptionsToFhirBundle(prescriptionRepository.findAllByPatient(patient));
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(bundle), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "findByIen", nickname = "findByIen")
    @RequestMapping(method = RequestMethod.GET, path="/MedicationOrder/{ien}", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ien", value = "Medications's IEN", required = true, dataType = "string", paramType = "path", defaultValue="67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Object.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findByIen(@PathVariable String ien) {
        ResponseEntity<String> response = null;

        try {
            MedicationOrder medicationOrder = prescriptionMapper.prescriptionToFhirMedicationOrder(prescriptionRepository.findByIen(ien));
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(medicationOrder), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "updateByIen", nickname = "updateByIen")
    @RequestMapping(method = RequestMethod.POST, path="/MedicationOrder/{ien}", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ien", value = "Medication's IEN", required = true, dataType = "string", paramType = "path", defaultValue="67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Object.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> updateByIen(@PathVariable String ien) {
        ResponseEntity<String> response = null;

        try {
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(prescriptionRepository.findByIen(ien)), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }
}
