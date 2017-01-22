package com.csra.service;

import com.csra.model.Drug;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by steffen on 1/21/17.
 */
@Service
public class DrugService extends RootService {

    static Logger log = LoggerFactory.getLogger(DrugService.class.getName());

    public Drug getDrug(String ien) {
        Drug drug = null;

        drug = drugRepository.findByIen(ien);

        return drug;
    }
}
