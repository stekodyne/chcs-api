package com.csra.service;

import com.csra.mapstruct.mapper.LegacyPatientMapper;
import com.csra.mapstruct.mapper.LegacyPrescriptionMapper;
import com.csra.mapstruct.mapper.MedicationOrderMapper;
import com.csra.mapstruct.mapper.ObservationMapper;
import com.csra.mapstruct.mapper.PatientMapper;
import com.csra.repository.DrugRepository;
import com.csra.repository.EventDatetimeRepository;
import com.csra.repository.PatientRepository;
import com.csra.repository.PrescriptionRepository;
import com.csra.repository.ProviderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qbase.legacy.api.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by steffen on 1/21/17.
 */
public class RootService {

    // Jackson

    @Autowired
    protected ObjectMapper objectMapper;

    // Repositories

    @Autowired
    protected PrescriptionRepository prescriptionRepository;

    @Autowired
    protected DrugRepository drugRepository;

    @Autowired
    protected ProviderRepository providerRepository;

    @Autowired
    protected PatientRepository patientRepository;

    @Autowired
    protected EventDatetimeRepository eventDatetimeRepository;

    // Legacy
    @Autowired
    protected IRepository chcsRepository;

    // Mapstruct Mappers

    @Autowired
    protected MedicationOrderMapper medicationOrderMapper;

    @Autowired
    protected ObservationMapper observationMapper;

    @Autowired
    protected PatientMapper patientMapper;

    @Autowired
    protected LegacyPatientMapper legacyPatientMapper;

    @Autowired
    protected LegacyPrescriptionMapper legacyPrescriptionMapper;

    // Services

    @Autowired
    protected PrescriptionService prescriptionService;

    @Autowired
    protected DrugService drugService;

    @Autowired
    protected PatientService patientService;

    @Autowired
    protected ProviderService providerService;

    @Autowired
    protected EventDatetimeService eventDatetimeService;
}
