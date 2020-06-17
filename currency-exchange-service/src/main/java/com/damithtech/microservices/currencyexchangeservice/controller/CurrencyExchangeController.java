package com.damithtech.microservices.currencyexchangeservice.controller;

import com.damithtech.microservices.currencyexchangeservice.model.ExchangeValue;
import com.damithtech.microservices.currencyexchangeservice.service.RetrieveExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DAMITH SAMARAKOON on 6/14/2020
 */
@RestController
public class CurrencyExchangeController {

    @Autowired
    RetrieveExchangeService retrieveExchangeService;

    @GetMapping("/currency-exchange/form/{from}/to/{to}")
    public ResponseEntity<ExchangeValue> getretrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        //ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));

        //ExchangeValue exchangeValue=retrieveExchangeService.retrieveExchangeValue(from,to);

        return ResponseEntity.ok().body(retrieveExchangeService.retrieveExchangeValue(from,to));

    }
}
