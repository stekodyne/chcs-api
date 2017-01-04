package com.csra.repository;

import com.csra.model.Drug;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DrugRepository extends CrudRepository<Drug, Long> {

    public Drug findByIen(String ien);

}
