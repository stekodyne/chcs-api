package com.csra.controller.fhir;

import com.csra.utility.FhirFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@RequestMapping("/fhir")
public class ObjectController extends RootController {

    @ApiOperation(value = "getObject", nickname = "getObject")
    @RequestMapping(method = RequestMethod.GET, path="/stub/{objectType}", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "objectType", value = "FHIR Object Type", required = true, dataType = "string", paramType = "query", defaultValue="patient")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Object.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> getObject(@PathVariable String objectType) {
        ResponseEntity<String> response = null;

        try {
            response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirFactory.getObject(objectType)), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

}
