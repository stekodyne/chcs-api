package com.csra.mapstruct.mapper;

import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.valueset.BundleTypeEnum;
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
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        HumanNameMapper.class,
        MaritalStatusMapper.class,
        IdMapper.class,
        CodeMapper.class,
        StringMapper.class,
        GenderMapper.class})
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    static Logger log = LoggerFactory.getLogger(PatientMapper.class.getName());

    @Mappings({
            @Mapping(source = "ien", target = "id"),
            @Mapping(source = "sex", target = "gender"),
            @Mapping(source = "maritalStatus", target = "maritalStatus")
    })
    ca.uhn.fhir.model.dstu2.resource.Patient patientToFhirPatient(com.csra.model.Patient patient);

    @InheritInverseConfiguration
    com.csra.model.Patient patientFromFhirPatient(ca.uhn.fhir.model.dstu2.resource.Patient patient);

    default Bundle patientsToFhirBundle(List<com.csra.model.Patient> patients) {
        Bundle bundle = new Bundle();
        bundle.setType(BundleTypeEnum.COLLECTION);

        for (com.csra.model.Patient resource : patients) {
            Bundle.Entry bundleEntry = new Bundle.Entry();
            bundleEntry.setResource(patientToFhirPatient(resource));
            bundle.getEntry().add(bundleEntry);
        }

        return bundle;
    }

    default List<com.csra.model.Patient> patientsFromFhirBundle(Bundle bundle) {
        ArrayList<com.csra.model.Patient> patients = new ArrayList<Patient>();

        if (bundle != null) {
            for (Bundle.Entry entry : bundle.getEntry()) {
                if (entry != null) {
                    patients.add(this.patientFromFhirPatient((ca.uhn.fhir.model.dstu2.resource.Patient) entry.getResource()));
                }
            }
        }

        return patients;
    }

}
