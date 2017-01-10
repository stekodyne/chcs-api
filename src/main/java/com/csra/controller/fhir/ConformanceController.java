package com.csra.controller.fhir;

import com.csra.fhir.Conformance;
import com.csra.utility.fhir.ChcsApiUtility;
import com.csra.utility.fhir.ObjectFactory;
import com.csra.utility.fhir.FhirUtility;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@RequestMapping("/fhir")
public class ConformanceController extends RootController {

    @ApiOperation(value = "getMetadata", nickname = "getMetadata")
    @RequestMapping(method = RequestMethod.GET, path="/Conformance/metadata", produces = "application/json+fhir")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Object.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> getMetadata(HttpServletRequest request) {
        ResponseEntity<String> response = null;

        try {
            Conformance conformance = (Conformance) ObjectFactory.getObject("conformance");
            conformance.setId(FhirUtility.createId());
            conformance.setUrl(FhirUtility.createUri(request.getRequestURI()));
            conformance.setStatus(FhirUtility.ConformanceStatus.DRAFT.code);
            conformance.setExperimental(FhirUtility.Boolean.TRUE.bool);
            conformance.setFhirVersion(FhirUtility.FHIR_VERSION);
            conformance.setDate(FhirUtility.convertDateTime(new Date()));
            conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_MEDICATIONORDER.reference);
            conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_PATIENT.reference);
            conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_DEVICEMETRIC.reference);
            conformance.getFormat().add(FhirUtility.Format.JSON.code);

            response = new ResponseEntity<String>(objectMapper.writeValueAsString(conformance), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

}
