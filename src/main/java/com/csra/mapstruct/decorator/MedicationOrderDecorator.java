package com.csra.mapstruct.decorator;

import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import com.csra.mapstruct.mapper.MedicationOrderMapper;
import com.csra.model.Drug;
import com.csra.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by steffen on 2/5/17.
 */
public abstract class MedicationOrderDecorator implements MedicationOrderMapper {

    @Autowired
    @Qualifier("delegate")
    private MedicationOrderMapper delegate;

    @Override
    public MedicationOrder prescriptionToFhirMedicationOrder(Prescription prescription, Drug drug) {
        MedicationOrder medicationOrder = delegate.prescriptionToFhirMedicationOrder(prescription, drug);
        try {
            CodeableConceptDt codeableConcept = new CodeableConceptDt();
            CodingDt coding = new CodingDt();

            coding.setDisplay(drug.getName());
            coding.setCode(drug.getPrimaryNdcNumber());
            codeableConcept.addCoding(coding);

            medicationOrder.setMedication(codeableConcept);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicationOrder;
    }
}
