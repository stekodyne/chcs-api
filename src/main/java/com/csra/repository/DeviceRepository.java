package com.csra.repository;

import com.csra.model.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public interface DeviceRepository extends CrudRepository<Device, Long> {

    public Device findByIen(String ien);
    public List<Device> findAll();

}
