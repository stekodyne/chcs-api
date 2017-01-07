package com.csra.mapstruct.mapper;

import com.csra.fhir.Code;
import com.csra.utility.fhir.FhirUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class CodeMapper {

    static Logger log = LoggerFactory.getLogger(CodeMapper.class.getName());

    public String asString (Code code) {
        return new String(code.getValue());
    }

    public Code asCode (String value) {
        try {
            return FhirUtility.createCode(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
