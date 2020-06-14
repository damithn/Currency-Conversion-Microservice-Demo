package com.damithtech.microservices.currencyexchangeservice.repository;

import com.damithtech.microservices.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author DAMITH SAMARAKOON on 6/14/2020
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from,String to);
}
