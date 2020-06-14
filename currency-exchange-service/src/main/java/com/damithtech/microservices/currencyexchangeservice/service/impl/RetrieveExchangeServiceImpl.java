package com.damithtech.microservices.currencyexchangeservice.service.impl;

import com.damithtech.microservices.currencyexchangeservice.model.ExchangeValue;
import com.damithtech.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import com.damithtech.microservices.currencyexchangeservice.service.RetrieveExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author DAMITH SAMARAKOON on 6/14/2020
 */
@Service
public class RetrieveExchangeServiceImpl implements RetrieveExchangeService {

    @Autowired
    ExchangeValueRepository exchangeValueRepository;

    @Autowired
    Environment environment;

    @Override
    public ExchangeValue retrieveExchangeValue(String from, String to) {
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
