package com.csra.controller.fhir;

import com.csra.mapstruct.mapper.LegacyPatientMapper;
import com.csra.mapstruct.mapper.LegacyPrescriptionMapper;
import com.csra.mapstruct.mapper.PatientMapper;
import com.csra.mapstruct.mapper.PrescriptionMapper;
import com.csra.repository.DrugRepository;
import com.csra.repository.PatientRepository;
import com.csra.repository.PrescriptionRepository;
import com.csra.repository.ProviderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qbase.legacy.api.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by steffen on 12/21/16.
 */
@RestController
@EnableSwagger2
public abstract class RootController {

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    protected PrescriptionRepository prescriptionRepository;

    @Autowired
    protected DrugRepository drugRepository;

    @Autowired
    protected ProviderRepository providerRepository;

    @Autowired
    protected PatientRepository patientRepository;

    @Autowired
    protected PrescriptionMapper prescriptionMapper;

    @Autowired
    protected PatientMapper patientMapper;

    @Autowired
    protected IRepository chcsRepository;

    @Autowired
    protected LegacyPatientMapper legacyPatientMapper;

    @Autowired
    protected LegacyPrescriptionMapper legacyPrescriptionMapper;

}
