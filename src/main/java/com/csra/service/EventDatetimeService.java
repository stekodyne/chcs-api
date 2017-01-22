package com.csra.service;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.Observation;
import com.csra.fhir.ResourceContainer;
import com.csra.model.EventDatetime5300101;
import com.csra.utility.fhir.ObjectFactory;
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
        Bundle bundle = (Bundle) ObjectFactory.getObject("bundle");
        BundleType bundleType = (BundleType) ObjectFactory.getObject("bundletype");
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        List<EventDatetime5300101> events = eventDatetimeRepository.findAllByPatient(patientIen);

        for(EventDatetime5300101 resource : events) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            resourceContainer.setObservation(getObservationFromEventDatetime(resource));
            bundleEntry.setResource(resourceContainer);
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }

}
