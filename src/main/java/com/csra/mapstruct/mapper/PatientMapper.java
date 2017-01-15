package com.csra.mapstruct.mapper;

import com.csra.fhir.Bundle;
import com.csra.fhir.BundleEntry;
import com.csra.fhir.BundleType;
import com.csra.fhir.BundleTypeList;
import com.csra.fhir.ResourceContainer;
import com.csra.model.Patient;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steffen on 12/27/16.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {HumanNameMapper.class, MaritalStatusMapper.class, IdMapper.class, CodeMapper.class, StringMapper.class})
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper( PatientMapper.class );

    static Logger log = LoggerFactory.getLogger(PatientMapper.class.getName());

    @Mappings({
            @Mapping(source = "ien", target = "id"),
            @Mapping(source = "sex", target = "gender"),
            @Mapping(source = "maritalStatus", target = "maritalStatus")
    })
    com.csra.fhir.Patient patientToFhirPatient(com.csra.model.Patient patient);

    @InheritInverseConfiguration
    com.csra.model.Patient patientFromFhirPatient(com.csra.fhir.Patient patient);

    default com.csra.fhir.Bundle patientsToFhirBundle(List<com.csra.model.Patient> patients) {
        Bundle bundle = new Bundle();
        BundleType bundleType = new BundleType();
        bundleType.setValue(BundleTypeList.COLLECTION);
        bundle.setType(bundleType);

        for(com.csra.model.Patient resource : patients) {
            BundleEntry bundleEntry = new BundleEntry();
            ResourceContainer resourceContainer = new ResourceContainer();
            resourceContainer.setSpecificResource(this.patientToFhirPatient(resource));
            bundleEntry.setResource(resourceContainer);
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }

    default List<com.csra.model.Patient> patientsFromFhirBundle(com.csra.fhir.Bundle bundle){
        ArrayList<com.csra.model.Patient> patients = new ArrayList<Patient>();

        if(bundle != null) {
            for (BundleEntry entry : bundle.getEntry()) {
                ResourceContainer resourceContainer = entry.getResource();
                if (resourceContainer != null) {
                    patients.add(this.patientFromFhirPatient((com.csra.fhir.Patient) resourceContainer.getSpecificResource()));
                }
            }
        }

        return patients;
    }

}
