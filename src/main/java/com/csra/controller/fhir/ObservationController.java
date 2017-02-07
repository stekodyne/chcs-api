package com.csra.controller.fhir;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.valueset.IssueTypeEnum;
import com.csra.utility.fhir.FhirUtility;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class ObservationController extends RootController {

    static Logger log = LoggerFactory.getLogger(ObservationController.class.getName());

    @ApiOperation(value = "findAllByPatient", nickname = "findAllByPatient")
    @RequestMapping(method = RequestMethod.GET, path = "/Observation", produces = "application/json+fhir")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "patient", value = "Patient's IEN", required = true, dataType = "string", paramType = "query", defaultValue = "67")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Bundle.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAllByPatient(@RequestParam String patient) {
        ResponseEntity<String> response = null;

        Bundle bundle = eventDatetimeService.getObservationsForPatient(patient);
        if (bundle.getEntries().size() > 0) {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeBundleToString(bundle), HttpStatus.OK);
        } else {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(FhirUtility.createOperationOutcome("No observations found!",
                    IssueTypeEnum.NOT_FOUND)), HttpStatus.NOT_FOUND);
        }

        return response;
    }

    @ApiOperation(value = "createObservation", nickname = "createObservation")
    @RequestMapping(method = RequestMethod.POST, path = "/Observation", produces = "application/json+fhir")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "observation", value = "FHIR Observation", required = true, dataType = "string", paramType = "body", defaultValue = "")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> createObservation(@RequestBody Observation observation) throws Exception {
        ResponseEntity<String> response = null;

        try {

            Bundle bundle = eventDatetimeService.getObservationsForPatient("67");

            if (bundle.getEntries().size() > 0) {
                response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeBundleToString(bundle), HttpStatus.OK);
            } else {
                response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(FhirUtility.createOperationOutcome("No observations found!",
                        IssueTypeEnum.NOT_FOUND)), HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(FhirUtility.createOperationOutcome(e.getMessage(),
                    IssueTypeEnum.EXCEPTION)), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return response;
    }

}
