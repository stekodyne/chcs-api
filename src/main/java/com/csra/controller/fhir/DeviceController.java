package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.repository.DeviceRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@EnableSwagger2
@RequestMapping("/fhir")
public class DeviceController extends RootController {

    @Autowired
    private DeviceRepository deviceRepository;

    @ApiOperation(value = "findAll", nickname = "findAll")
    @RequestMapping(method = RequestMethod.GET, path="/devices", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Bundle.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAll() {
        ResponseEntity<String> response = null;

        try {
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(deviceRepository.findAll()), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }
}
