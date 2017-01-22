package com.csra.repository;

import com.csra.model.EventDatetime5300101;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EventDatetimeRepository extends CrudRepository<EventDatetime5300101, Long> {

    public EventDatetime5300101 findByIen(String ien);
    public List<EventDatetime5300101> findAll();
    public List<EventDatetime5300101> findAllByPatient(String ien);

}
