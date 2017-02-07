package com.csra.controller.fhir;

import ca.uhn.fhir.model.dstu2.resource.Conformance;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceResourceStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import com.csra.utility.fhir.ChcsApiUtility;
import com.csra.utility.fhir.FhirUtility;
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
    @RequestMapping(method = RequestMethod.GET, path = "/Conformance/metadata", produces = "application/json+fhir")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Conformance.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public ResponseEntity<String> getMetadata(HttpServletRequest request) {
        ResponseEntity<String> response = null;

        Conformance conformance = new Conformance();
        conformance.setId(FhirUtility.createId().getId());
        conformance.setUrl(FhirUtility.createUri(request.getRequestURI()).getValue());
        conformance.setStatus(ConformanceResourceStatusEnum.DRAFT);
        conformance.setExperimental(true);
        conformance.setFhirVersion(FhirUtility.FHIR_VERSION);
        conformance.setDate(new DateTimeDt(new Date()));
        conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_MEDICATIONORDER.reference);
        conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_PATIENT.reference);
        conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_DEVICEMETRIC.reference);
        conformance.getProfile().add(ChcsApiUtility.Profile.CHCSAPI_OBSERVATION.reference);
        conformance.getFormat().add(FhirUtility.Format.JSON.code);

        response = new ResponseEntity<String>(fhirContext.newJsonParser().encodeResourceToString(conformance), HttpStatus.OK);

        return response;
    }

}
