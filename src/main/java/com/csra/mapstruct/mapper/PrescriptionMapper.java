package com.csra.mapstruct.mapper;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.ResourceContainer;
import com.csra.model.Prescription;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steffen on 12/27/16.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {ReferenceMapper.class, MedicationOrderStatusMapper.class})
public interface PrescriptionMapper {

    PrescriptionMapper INSTANCE = Mappers.getMapper( PrescriptionMapper.class );

    @Mappings({
            @Mapping(source = "ien", target = "id"),
            @Mapping(source = "patient", target = "patient"),
            @Mapping(source = "provider", target = "prescriber"),
            @Mapping(source = "drug", target = "medicationReference")
    })
    com.csra.fhir.MedicationOrder prescriptionToFhirMedicationOrder(Prescription prescription);

    @InheritInverseConfiguration
    Prescription prescriptionFromFhirMedicationOrder(com.csra.fhir.MedicationOrder medicationOrder);

    default Bundle prescriptionsToFhirBundle(List<Prescription> prescriptions) {
        Bundle bundle = new Bundle();
        BundleType bundleType = new BundleType();
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        for(Prescription resource : prescriptions) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            bundleEntry.setResource(resourceContainer);
            bundleEntry.getResource().setMedicationOrder(this.prescriptionToFhirMedicationOrder(resource));
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }

    default List<Prescription> prescriptionsFromFhirBundle(Bundle bundle){
        ArrayList<Prescription> prescriptions = new ArrayList<Prescription>();

        if(bundle != null) {
            for (BundleEntry entry : bundle.getEntry()) {
                ResourceContainer resourceContainer = entry.getResource();
                if (resourceContainer != null) {
                    prescriptions.add(this.prescriptionFromFhirMedicationOrder(resourceContainer.getMedicationOrder()));
                }
            }
        }

        return prescriptions;
    }

}
