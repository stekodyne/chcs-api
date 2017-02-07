package com.csra.mapstruct.mapper;

import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import com.csra.model.MaritalStatus;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class MaritalStatusMapper {

    public MaritalStatus asMaritalStatus(BoundCodeableConceptDt<MaritalStatusCodesEnum> maritalStatusCodesEnum) {
        List<CodingDt> codings = maritalStatusCodesEnum.getCoding();
        if (codings.size() > 0) {
            CodingDt coding = codings.get(0);
            MaritalStatus maritalStatus = new MaritalStatus();
            maritalStatus.setIen(coding.getId().getValue());
            maritalStatus.setAbbreviation(coding.getCode());
            maritalStatus.setName(coding.getDisplay());
            return maritalStatus;
        } else {
            return new MaritalStatus();
        }
    }

    public BoundCodeableConceptDt<MaritalStatusCodesEnum> asCodeableConcept(MaritalStatus maritalStatus) {
        try {
            if (maritalStatus == null) {
                return new BoundCodeableConceptDt<MaritalStatusCodesEnum>(MaritalStatusCodesEnum.VALUESET_BINDER, MaritalStatusCodesEnum.UNK);
            } else {
                return new BoundCodeableConceptDt<MaritalStatusCodesEnum>(MaritalStatusCodesEnum.VALUESET_BINDER, MaritalStatusCodesEnum.forCode(maritalStatus.getAbbreviation()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
