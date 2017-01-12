package com.csra.mapstruct.mapper;

import com.csra.fhir.Id;
import com.csra.utility.fhir.FhirUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class IdMapper {

    static Logger log = LoggerFactory.getLogger(IdMapper.class.getName());

    public String asString (Id id) {
        return new String(id.getValue());
    }

    public Id asId (String value) {
        try {
            return FhirUtility.createId(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
