package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.fhir.Patient;
import com.csra.mapstruct.mapper.PatientMapper;
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
import com.csra.repository.PatientRepository;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

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
    @RequestMapping(method = RequestMethod.GET, path="/Patient", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Object.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAll() {
        ResponseEntity<String> response = null;

        try {
            Bundle bundle = patientMapper.patientsToFhirBundle(patientRepository.findAll());
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(bundle), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "findByIen", nickname = "findByIen")
    @RequestMapping(method = RequestMethod.GET, path="/Patient/{ien}", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ien", value = "Patient's IEN", required = true, dataType = "string", paramType = "path", defaultValue="67")
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
            Patient patient = patientMapper.patientToFhirPatient(patientRepository.findByIen(ien));
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(patient), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

    @ApiOperation(value = "updateByIen", nickname = "updateByIen")
    @RequestMapping(method = RequestMethod.POST, path="/Patient/{ien}", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ien", value = "Patient's IEN", required = true, dataType = "string", paramType = "path", defaultValue="67")
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
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(patientRepository.findByIen(ien)), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

}
