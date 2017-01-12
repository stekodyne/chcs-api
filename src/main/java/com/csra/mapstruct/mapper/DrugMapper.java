package com.csra.mapstruct.mapper;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.ResourceContainer;
import com.csra.model.Drug;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steffen on 12/27/16.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {})
public interface DrugMapper {

    DrugMapper INSTANCE = Mappers.getMapper( DrugMapper.class );

    @Mappings({})
    com.csra.fhir.Medication drugToFhirMedication(Drug drug);

    @InheritInverseConfiguration
    Drug drugFromFhirMedicationOrder(com.csra.fhir.Medication medication);

    default Bundle drugsToFhirBundle(List<Drug> drugs) {
        Bundle bundle = new Bundle();
        BundleType bundleType = new BundleType();
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        for(Drug resource : drugs) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            bundleEntry.setResource(resourceContainer);
            bundleEntry.getResource().setMedication(this.drugToFhirMedication(resource));
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }

    default List<Drug> drugsFromFhirBundle(Bundle bundle){
        ArrayList<Drug> drugs = new ArrayList<Drug>();

        if(bundle != null) {
            for (BundleEntry entry : bundle.getEntry()) {
                ResourceContainer resourceContainer = entry.getResource();
                if (resourceContainer != null) {
                    drugs.add(this.drugFromFhirMedicationOrder(resourceContainer.getMedication()));
                }
            }
        }

        return drugs;
    }

}
