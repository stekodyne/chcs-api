package com.csra.controller.fhir;

import com.csra.fhir.Bundle;
import com.csra.fhir.IssueTypeList;
import com.csra.fhir.MedicationOrder;
import com.csra.model.Drug;
import com.csra.model.Patient;
import com.csra.model.Prescription;
import com.csra.model.Provider;
import com.csra.utility.fhir.FhirUtility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.intersys.classes.ArrayOfDataTypes;
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

import java.util.List;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@EnableSwagger2
@RequestMapping("/fhir")
public class ObservationController extends RootController {

    static Logger log = LoggerFactory.getLogger(ObservationController.class.getName());

    @ApiOperation(value = "findAllByPatient", nickname = "findAllByPatient")
    @RequestMapping(method = RequestMethod.GET, path="/Observation", produces = "application/json+fhir")
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
            Bundle bundle = eventDatetimeService.getObservationsForPatient(patient);
            if (bundle.getEntry().size() > 0) {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(bundle), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(objectMapper.writeValueAsString(FhirUtility.createOperationOutcome("No prescriptions found!",
                        IssueTypeList.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }
        } catch (JsonProcessingException e) {
            response = new ResponseEntity<String>("{\"error\": \"Failed to pasre object!\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

}
