package com.csra.mapstruct.mapper;

import com.csra.model.Drug;
import com.csra.model.Prescription;
import com.csra.model.Provider;
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
public interface LegacyPrescriptionMapper {

    LegacyPrescriptionMapper INSTANCE = Mappers.getMapper(LegacyPrescriptionMapper.class);

    @Mappings({
            @Mapping(target = "ien", expression = "java( null )"),
            @Mapping(source = "drug.primaryNdcNumber", target = "ndcValue"),
            @Mapping(target = "signature", expression = "java( new String( \"QID PO\" ))"),
            @Mapping(target = "numberOfRefills", expression = "java( 1.0 )"),
            @Mapping(target = "quantityOrdered", expression = "java( 10.0 )"),
            @Mapping(target = "orderExpirationDate", expression = "java( new java.util.Date() )"),
            @Mapping(target = "issueDate", expression = "java( new java.util.Date() )"),
            @Mapping(source = "provider.name", target = "providerLastName"),
            @Mapping(target = "narrative", expression = "java( new String( \"This is a test!\" ))")
    })
    com.qbase.legacy.api.dao.Prescription prescriptionToLegacyPrescription(Prescription prescription, Drug drug, Provider provider);

    @InheritInverseConfiguration
    Prescription prescriptionFromLegacyPrescription(com.qbase.legacy.api.dao.Prescription prescription);

}
