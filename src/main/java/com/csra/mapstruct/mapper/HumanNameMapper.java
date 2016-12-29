package com.csra.mapstruct.mapper;

import com.csra.fhir.HumanName;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by steffen on 12/27/16.
 */
@Component
public class HumanNameMapper {

    public String asString (List<HumanName> humanName) {
        HumanName name = humanName.get(0);
        return new String(name.getText());
    }

    public List<HumanName> asHumanName (String fullname) {
        try {
            List<HumanName> names = new ArrayList<HumanName>();
            HumanName name = new HumanName();
            String[] nameTokens = fullname.split(",");
            name.setText(fullname);
            name.getFamily().add(nameTokens[0]);
            name.getGiven().add(nameTokens[1]);
            name.setId(UUID.randomUUID().toString());
            names.add(name);
            return names;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
