package com.csra.mapstruct.mapper;

import com.csra.controller.fhir.MedicationOrderController;
import com.csra.fhir.HumanName;
import com.csra.utility.fhir.FhirUtility;
import com.csra.utility.fhir.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class HumanNameMapper {

    static Logger log = LoggerFactory.getLogger(HumanNameMapper.class.getName());

    public String asString (List<HumanName> humanName) {
        HumanName name = humanName.get(0);
        return new String(name.getFamily().get(0).getValue().concat(", ").concat(name.getGiven().get(0).getValue()));
    }

    public List<HumanName> asHumanName (String fullname) {
        try {
            List<HumanName> names = new ArrayList<HumanName>();
            HumanName name = (HumanName) ObjectFactory.getObject("humanname");
            String[] nameTokens = fullname.split(",");
            name.setText(FhirUtility.convert(fullname));
            name.getFamily().add(FhirUtility.convert(nameTokens[0]));
            name.getGiven().add(FhirUtility.convert(nameTokens[1]));
            name.setId(UUID.randomUUID().toString());
            names.add(name);
            return names;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
