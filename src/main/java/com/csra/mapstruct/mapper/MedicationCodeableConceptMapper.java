package com.csra.mapstruct.mapper;

import com.csra.fhir.CodeableConcept;
import com.csra.model.Drug;
import com.csra.utility.fhir.FhirUtility;
import org.springframework.stereotype.Component;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class MedicationCodeableConceptMapper {

    public CodeableConcept asMedicationCodeableConcept(Drug drug) {
        CodeableConcept codeableConcept = FhirUtility.createCodeableConcept(drug.getPrimaryNdcNumber(), drug.getName());
        return codeableConcept;
    }

    public Drug asDrug(CodeableConcept codeableConcept) {
        Drug drug = new Drug();
        drug.setName(codeableConcept.getCoding().get(0).getDisplay().getValue());
        drug.setIen(codeableConcept.getCoding().get(0).getCode().getValue());
        return drug;
    }

}
