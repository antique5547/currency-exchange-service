package com.antique.microserices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeJpaRepository extends JpaRepository<ExchangeValue, Long>{
public ExchangeValue findByFromAndTo(String from,String to);
}
