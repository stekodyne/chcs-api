package com.csra.service;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.api.BundleEntry;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.valueset.BundleTypeEnum;
import com.csra.model.EventDatetime5300101;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by steffen on 1/21/17.
 */
@Service
public class EventDatetimeService extends RootService {

    static Logger log = LoggerFactory.getLogger(EventDatetimeService.class.getName());

    public Observation getObservationFromEventDatetime(EventDatetime5300101 eventDatetime) {
        Observation observation = null;

        observation = observationMapper.eventDatetimeToObservation(eventDatetime);

        return observation;
    }

    public Bundle getObservationsForPatient(String patientIen) {
        Bundle bundle = new Bundle();
        BoundCodeDt<BundleTypeEnum> bundleType = new BoundCodeDt<BundleTypeEnum>(BundleTypeEnum.VALUESET_BINDER, BundleTypeEnum.COLLECTION);
        bundle.setType(bundleType);

        List<EventDatetime5300101> events = eventDatetimeRepository.findAllByPatient(patientIen);

        for (EventDatetime5300101 resource : events) {
            BundleEntry bundleEntry = new BundleEntry();
            bundleEntry.setResource(getObservationFromEventDatetime(resource));
            bundle.getEntries().add(bundleEntry);
        }

        return bundle;
    }

}
