package com.damithtech.microservices.currencyconversionservice.controller;

import com.damithtech.microservices.currencyconversionservice.model.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author DAMITH SAMARAKOON on 6/14/2020
 */
@RestController
public class CurrencyConversionCotroller
{
    @GetMapping("/currency-convert/from/{from}/to/{to}/quntity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from,
                                                  @PathVariable String to,
                                                  @PathVariable String quantity){
        return new CurrencyConversionBean(1l,from,to,"65",quantity,quantity,0);

    }
}
