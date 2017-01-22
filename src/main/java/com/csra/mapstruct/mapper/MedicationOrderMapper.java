package com.csra.mapstruct.mapper;

import com.csra.model.Drug;
import com.csra.model.Prescription;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by steffen on 12/27/16.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {ReferenceMapper.class, MedicationOrderStatusMapper.class, IdMapper.class, MedicationCodeableConceptMapper.class})
public interface MedicationOrderMapper {

    MedicationOrderMapper INSTANCE = Mappers.getMapper( MedicationOrderMapper.class );

    static Logger log = LoggerFactory.getLogger(MedicationOrderMapper.class.getName());

    @Mappings({
            @Mapping(source = "prescription.ien", target = "id"),
            @Mapping(source = "prescription.patient", target = "patient"),
            @Mapping(source = "prescription.provider", target = "prescriber"),
            @Mapping(source = "drug", target = "medicationCodeableConcept"),
            @Mapping(source = "drug.ien", target = "medicationReference")
    })
    com.csra.fhir.MedicationOrder prescriptionToFhirMedicationOrder(Prescription prescription, Drug drug);

    @InheritInverseConfiguration
    Prescription prescriptionFromFhirMedicationOrder(com.csra.fhir.MedicationOrder medicationOrder);

}
