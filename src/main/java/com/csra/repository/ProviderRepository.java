package com.csra.repository;

import com.csra.model.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProviderRepository extends CrudRepository<Provider, Long> {

    public Provider findByIen(String ien);

}
