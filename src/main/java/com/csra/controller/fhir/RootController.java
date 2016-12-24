package com.csra.controller.fhir;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@RequestMapping("/fhir")
public abstract class RootController {

    @Autowired
    protected ObjectMapper objectMapper;

}
