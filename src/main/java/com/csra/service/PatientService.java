package com.csra.service;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.api.BundleEntry;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.valueset.BundleTypeEnum;
import com.csra.model.Patient;
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

    public ca.uhn.fhir.model.dstu2.resource.Patient getFhirPatientFromPatient(String ien) {
        ca.uhn.fhir.model.dstu2.resource.Patient patient = null;
        Patient p = getPatient(ien);

        patient = patientMapper.patientToFhirPatient(p);

        return patient;
    }

    public Bundle getPatients() {
        Bundle bundle = new Bundle();
        BoundCodeDt<BundleTypeEnum> bundleType = new BoundCodeDt<BundleTypeEnum>(BundleTypeEnum.VALUESET_BINDER, BundleTypeEnum.COLLECTION);
        bundle.setType(bundleType);

        List<Patient> prescriptions = patientRepository.findAll();

        for (Patient resource : prescriptions) {
            BundleEntry bundleEntry = new BundleEntry();
            bundleEntry.setResource(patientMapper.patientToFhirPatient(resource));
            bundle.getEntries().add(bundleEntry);
        }

        return bundle;
    }
}
