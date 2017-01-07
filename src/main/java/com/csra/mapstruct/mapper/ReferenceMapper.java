package com.csra.mapstruct.mapper;

import com.csra.fhir.Reference;
import com.csra.utility.fhir.FhirUtility;
import com.csra.utility.fhir.ObjectFactory;
import org.springframework.stereotype.Component;
import java.util.UUID;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class ReferenceMapper {

    public String asString (Reference reference) {
        return new String(reference.getDisplay().getValue());
    }

    public Reference asReference (String item) {
        try {
            Reference reference = (Reference) ObjectFactory.getObject("reference");
            reference.setId(FhirUtility.createUuid().getValue());
            reference.setDisplay(FhirUtility.createString(item));
            return reference;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
