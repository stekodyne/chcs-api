package com.csra.repository;

import com.csra.model.Prescription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {

    public Prescription findByIen(String ien);
    public List<Prescription> findAll();

}
