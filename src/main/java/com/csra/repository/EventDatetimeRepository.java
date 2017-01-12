package com.csra.repository;

import com.csra.model.EventDatatime5300101;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EventDatetimeRepository extends CrudRepository<EventDatatime5300101, Long> {

    public EventDatatime5300101 findByIen(String ien);
    public List<EventDatatime5300101> findAll();

}
