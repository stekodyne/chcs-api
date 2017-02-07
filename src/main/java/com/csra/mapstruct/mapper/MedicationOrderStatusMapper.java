package com.csra.mapstruct.mapper;

import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import org.springframework.stereotype.Component;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class MedicationOrderStatusMapper {

    public String asString(BoundCodeDt<MedicationOrderStatusEnum> status) {
        return new String(status.getValue());
    }

    public BoundCodeDt<MedicationOrderStatusEnum> asMedicationOrderStatus(String source) {
        try {
            BoundCodeDt<MedicationOrderStatusEnum> status = null;
            try {
                status = new BoundCodeDt<MedicationOrderStatusEnum>(MedicationOrderStatusEnum.VALUESET_BINDER, MedicationOrderStatusEnum.forCode(source));
            } catch (IllegalArgumentException ex) {
                status = new BoundCodeDt<MedicationOrderStatusEnum>(MedicationOrderStatusEnum.VALUESET_BINDER, MedicationOrderStatusEnum.ON_HOLD);
            }
            return status;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
