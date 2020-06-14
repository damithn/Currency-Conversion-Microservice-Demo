package com.damithtech.microservices.currencyexchangeservice.service;

import com.damithtech.microservices.currencyexchangeservice.model.ExchangeValue;

/**
 * @author DAMITH SAMARAKOON on 6/14/2020
 */
public interface RetrieveExchangeService {
    public ExchangeValue retrieveExchangeValue(String from,String to);
}
