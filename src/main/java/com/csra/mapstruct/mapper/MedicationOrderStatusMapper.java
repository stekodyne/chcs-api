package com.csra.mapstruct.mapper;

import com.csra.fhir.MedicationOrderStatus;
import com.csra.fhir.MedicationOrderStatusList;
import org.springframework.stereotype.Component;
import java.util.UUID;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class MedicationOrderStatusMapper {

    public String asString (MedicationOrderStatus status) {
        return new String(status.getValue().value());
    }

    public MedicationOrderStatus asMedicationOrderStatus (String source) {
        try {
            MedicationOrderStatus status = new MedicationOrderStatus();
            status.setId(UUID.randomUUID().toString());
            try {
                status.setValue(MedicationOrderStatusList.fromValue(source));
            } catch (IllegalArgumentException ex) {
                status.setValue(MedicationOrderStatusList.COMPLETED);
            }
            return status;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
