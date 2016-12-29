package com.csra.mapstruct.mapper;

import com.csra.fhir.CodeableConcept;
import com.csra.fhir.Coding;
import com.csra.model.MaritalStatus;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class MaritalStatusMapper {

    public MaritalStatus asMaritalStatus (CodeableConcept codeableConcept) {
        List<Coding> codings = codeableConcept.getCoding();
        if(codings.size() > 0) {
            Coding coding = codings.get(0);
            MaritalStatus maritalStatus = new MaritalStatus();
            maritalStatus.setIen(coding.getId());
            maritalStatus.setAbbreviation(coding.getCode());
            maritalStatus.setName(coding.getDisplay());
            return maritalStatus;
        } else {
            return new MaritalStatus();
        }
    }

    public CodeableConcept asCodeableConcept (MaritalStatus maritalStatus) {
        try {
            if (maritalStatus == null) {
                return new CodeableConcept();
            } else {
                CodeableConcept codeableConcept = new CodeableConcept();
                Coding coding = new Coding();
                coding.setId(maritalStatus.getIen());
                coding.setDisplay(maritalStatus.getName());
                coding.setCode(maritalStatus.getAbbreviation());
                codeableConcept.getCoding().add(coding);
                return codeableConcept;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
