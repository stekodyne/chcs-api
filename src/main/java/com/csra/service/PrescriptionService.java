package com.csra.service;

import ca.uhn.fhir.model.api.Bundle;
import ca.uhn.fhir.model.api.BundleEntry;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.valueset.BundleTypeEnum;
import com.csra.model.ChcsModel;
import com.csra.model.Drug;
import com.csra.model.Patient;
import com.csra.model.Prescription;
import com.csra.model.Provider;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.intersys.classes.ArrayOfDataTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by steffen on 1/21/17.
 */
@Service
public class PrescriptionService extends RootService {

    static Logger log = LoggerFactory.getLogger(PrescriptionService.class.getName());

    public Prescription getPrescription(String ien) {
        Prescription prescription = null;

        prescription = prescriptionRepository.findByIen(ien);

        return prescription;
    }

    public Map<String, ChcsModel> getPrescriptionDetails(Prescription prescription) {
        Map<String, ChcsModel> map = new HashMap<String, ChcsModel>();

        if (prescription != null) {
            map.put(prescription.getClass().getSimpleName(), prescription);

            if (prescription.getDrug() != null) {
                map.put(Drug.class.getSimpleName(), drugService.getDrug(prescription.getDrug()));
            }

            if (prescription.getPatient() != null) {
                map.put(Patient.class.getSimpleName(), patientService.getPatient(prescription.getPatient()));
            }

            if (prescription.getProvider() != null) {
                map.put(Provider.class.getSimpleName(), providerService.getProvider(prescription.getProvider()));
            }
        }

        return map;
    }

    public MedicationOrder getMedicationOrderFromPrescription(String ien) {
        MedicationOrder medicationOrder = null;
        Map<String, ChcsModel> map = new HashMap<String, ChcsModel>();
        Prescription prescription = getPrescription(ien);

        if (prescription != null) {
            map = getPrescriptionDetails(prescription);
        }

        medicationOrder = medicationOrderMapper.prescriptionToFhirMedicationOrder(prescription, (Drug) map.get("Drug"));

        return medicationOrder;
    }

    public MedicationOrder getMedicationOrderFromPrescription(Prescription prescription) {
        MedicationOrder medicationOrder = null;
        Map<String, ChcsModel> map = new HashMap<String, ChcsModel>();

        if (prescription != null) {
            map = getPrescriptionDetails(prescription);
        }

        medicationOrder = medicationOrderMapper.prescriptionToFhirMedicationOrder(prescription, (Drug) map.get("Drug"));

        return medicationOrder;
    }

    public Bundle getMedicationOrdersForPatient(String patientIen) {
        Bundle bundle = new Bundle();
        BoundCodeDt<BundleTypeEnum> bundleType = new BoundCodeDt<BundleTypeEnum>(BundleTypeEnum.VALUESET_BINDER, BundleTypeEnum.COLLECTION);
        bundle.setType(bundleType);

        List<Prescription> prescriptions = prescriptionRepository.findAllByPatient(patientIen);

        for (Prescription resource : prescriptions) {
            BundleEntry bundleEntry = new BundleEntry();
            bundleEntry.setResource(getMedicationOrderFromPrescription(resource));
            bundle.getEntries().add(bundleEntry);
        }

        return bundle;
    }

    public void createPrescription(MedicationOrder medicationOrder) throws Exception {
        try {

            if (medicationOrder == null) {
                throw new Exception("MedicationOrder was null!");
            }

            Prescription prescription = medicationOrderMapper.prescriptionFromFhirMedicationOrder(medicationOrder);
            Drug drug = drugService.getDrug(prescription.getDrug());
            Provider provider = providerService.getProvider(prescription.getProvider());
            Patient patient = patientService.getPatient(prescription.getPatient());

            log.debug("Patient: {}", patient);

            if (patient == null || provider == null) {
                throw new Exception("Drug or Provider are missing or incomplete!");
            } else {
                com.qbase.legacy.api.dao.Patient legacyPatient = legacyPatientMapper.patientToLegacyPatient(patient);

                log.debug("Legacy Patient: {}", legacyPatient);

                com.qbase.legacy.api.dao.Prescription legacyPrescription = legacyPrescriptionMapper.prescriptionToLegacyPrescription(prescription, drug, provider);

                log.debug("Legacy Prescription: {}", legacyPrescription);

                ArrayOfDataTypes errors = chcsRepository.savePrescription(legacyPatient, legacyPrescription);

                log.debug("Errors: {}", errors);

                if (errors != null) {
                    throw new Exception(errors.toString());
                }
            }

        } catch (JsonProcessingException e) {
            throw new Exception("Failed to pasre object!");
        }
    }
}
