package com.csra.controller.fhir;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Patient;
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
import org.springframework.web.bind.annotation.PathVariable;
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
public class PatientController extends RootController {

    static Logger log = LoggerFactory.getLogger(PatientController.class.getName());

    @ApiOperation(value = "findAll", nickname = "findAll")
    @RequestMapping(method = RequestMethod.GET, path = "/Patient", produces = "application/json+fhir")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Bundle.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> findAll() {
        ResponseEntity<String> response = null;

        Bundle bundle = patientService.getPatients();

        if (bundle.getEntries().size() > 0) {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeBundleToString(bundle), HttpStatus.OK);
        } else {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(FhirUtility.createOperationOutcome("No patients found!",
                    IssueTypeEnum.NOT_FOUND)), HttpStatus.NOT_FOUND);
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

        Patient p = patientService.getFhirPatientFromPatient(ien);

        if (p != null) {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(p), HttpStatus.OK);
        } else {
            response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(FhirUtility.createOperationOutcome("No patient found!",
                    IssueTypeEnum.NOT_FOUND)), HttpStatus.NOT_FOUND);
        }

        return response;
    }

}
