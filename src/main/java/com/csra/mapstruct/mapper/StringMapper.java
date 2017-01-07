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
public class StringMapper {

    static Logger log = LoggerFactory.getLogger(StringMapper.class.getName());

    public java.lang.String asString (com.csra.fhir.String value) {
        return new String(value.getValue());
    }

    public com.csra.fhir.String asString (java.lang.String value) {
        try {
            return FhirUtility.createString(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
