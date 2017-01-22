package com.csra.service;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.ResourceContainer;
import com.csra.model.Patient;
import com.csra.utility.fhir.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by steffen on 1/21/17.
 */
@Service
public class PatientService extends RootService {

    static Logger log = LoggerFactory.getLogger(PatientService.class.getName());

    public Patient getPatient(String ien) {
        Patient patient = null;

        patient = patientRepository.findByIen(ien);

        return patient;
    }

    public com.csra.fhir.Patient getFhirPatientFromPatient(String ien) {
        com.csra.fhir.Patient patient = null;
        Patient p = getPatient(ien);

        patient = patientMapper.patientToFhirPatient(p);

        return patient;
    }

    public Bundle getPatients() {
        Bundle bundle = (Bundle) ObjectFactory.getObject("bundle");
        BundleType bundleType = (BundleType) ObjectFactory.getObject("bundletype");
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        List<Patient> prescriptions = patientRepository.findAll();

        for(Patient resource : prescriptions) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            resourceContainer.setPatient(patientMapper.patientToFhirPatient(resource));
            bundleEntry.setResource(resourceContainer);
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }
}
