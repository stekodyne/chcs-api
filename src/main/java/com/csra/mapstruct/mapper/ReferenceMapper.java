package com.csra.mapstruct.mapper;

import com.csra.fhir.Reference;
import org.springframework.stereotype.Component;
import java.util.UUID;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class ReferenceMapper {

    public String asString (Reference reference) {
        return new String(reference.getDisplay());
    }

    public Reference asReference (String item) {
        try {
            Reference reference = new Reference();
            reference.setId(UUID.randomUUID().toString());
            reference.setDisplay(item);
            return reference;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
