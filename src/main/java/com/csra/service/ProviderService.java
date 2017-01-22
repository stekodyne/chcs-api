package com.csra.service;

import com.csra.model.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by steffen on 1/21/17.
 */
@Service
public class ProviderService extends RootService {

    static Logger log = LoggerFactory.getLogger(ProviderService.class.getName());

    public Provider getProvider(String ien) {
        Provider provider = null;

        provider = providerRepository.findByIen(ien);

        return provider;
    }
}
