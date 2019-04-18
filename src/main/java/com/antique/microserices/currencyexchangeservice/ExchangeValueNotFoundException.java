package com.antique.microserices.currencyexchangeservice;

public class ExchangeValueNotFoundException extends RuntimeException {
public ExchangeValueNotFoundException(String msg) {
	super(msg);
}
}
