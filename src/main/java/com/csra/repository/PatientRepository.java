package com.csra.repository;

import com.csra.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public interface PatientRepository extends CrudRepository<Patient, Long> {

    public Patient findByIen(String ien);
    public List<Patient> findAll();

}
