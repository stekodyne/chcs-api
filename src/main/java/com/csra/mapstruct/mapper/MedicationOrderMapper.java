package com.csra.mapstruct.mapper;

import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import com.csra.mapstruct.decorator.MedicationOrderDecorator;
import com.csra.model.Drug;
import com.csra.model.Prescription;
import org.mapstruct.DecoratedWith;
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
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {ReferenceMapper.class, MedicationOrderStatusMapper.class, IdMapper.class})
@DecoratedWith(MedicationOrderDecorator.class)
public interface MedicationOrderMapper {

    MedicationOrderMapper INSTANCE = Mappers.getMapper(MedicationOrderMapper.class);

    static Logger log = LoggerFactory.getLogger(MedicationOrderMapper.class.getName());

    @Mappings({
            @Mapping(source = "prescription.ien", target = "id"),
            @Mapping(source = "prescription.patient", target = "patient"),
            @Mapping(source = "prescription.provider", target = "prescriber")
    })
    MedicationOrder prescriptionToFhirMedicationOrder(Prescription prescription, Drug drug);

    @InheritInverseConfiguration
    Prescription prescriptionFromFhirMedicationOrder(MedicationOrder medicationOrder);

}
