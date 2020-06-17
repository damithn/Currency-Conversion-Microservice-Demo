package com.damithtech.microservices.currencyconversionservice;

import com.damithtech.microservices.currencyconversionservice.model.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author DAMITH SAMARAKOON on 6/18/2020
 */
@FeignClient(name ="currency-exchange-service",url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-convert/from/{from}/to/{to}/quntity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from,
                                                  @PathVariable String to);

}
