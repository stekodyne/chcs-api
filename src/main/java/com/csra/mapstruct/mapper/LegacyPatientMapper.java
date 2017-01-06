package com.csra.mapstruct.mapper;

import com.csra.model.Patient;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * Created by steffen on 12/27/16.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LegacyPatientMapper {

    LegacyPatientMapper INSTANCE = Mappers.getMapper( LegacyPatientMapper.class );

    @Mappings({
            @Mapping(source = "ien", target = "ien"),
            @Mapping(source = "ssn", target = "ssn"),
            @Mapping(target = "firstName", expression = "java( new String( patient.getName().split(\",\")[1] ))"),
            @Mapping(target = "lastName", expression = "java( new String( patient.getName().split(\",\")[0] ))"),
            @Mapping(source = "name", target = "sex"),
            @Mapping(source = "dateOfBirth", target = "dob"),
            @Mapping(source = "streetAddress", target = "address"),
            @Mapping(source = "city", target = "city"),
            @Mapping(source = "state.name", target = "state"),
            @Mapping(source = "zipCode", target = "zipCode"),
            @Mapping(source = "phone", target = "homePhoneNumber"),
            @Mapping(source = "officePhone", target = "workPhoneNumber"),
            @Mapping(source = "phone", target = "cellPhoneNumber"),
            @Mapping(source = "race.description", target = "race"),
            @Mapping(source = "pobCity", target = "birthCity"),
            @Mapping(source = "pobState.name", target = "birthState"),
            @Mapping(source = "race.code", target = "raceCDCValue")
    })
    com.qbase.legacy.api.dao.Patient patientToLegacyPatient(Patient patient);

    @InheritInverseConfiguration
    Patient patientFromLegacyPatient(com.qbase.legacy.api.dao.Patient patient);

}
