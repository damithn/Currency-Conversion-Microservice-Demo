package com.damithtech.microservices.limitsservice.controller;

import com.damithtech.microservices.limitsservice.model.Configuration;
import com.damithtech.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DAMITH SAMARAKOON on 6/10/2020
 */
@RestController
public class LimitConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retreiveLimitsFormConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
