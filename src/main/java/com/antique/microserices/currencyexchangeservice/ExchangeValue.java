package com.antique.microserices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class ExchangeValue {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversionMultiplte;
	private int port;
	
	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(String from, String to, BigDecimal conversionMultiplte) {
		super();
		this.from = from;
		this.to = to;
		this.conversionMultiplte = conversionMultiplte;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiplte() {
		return conversionMultiplte;
	}
	public void setConversionMultiplte(BigDecimal conversionMultiplte) {
		this.conversionMultiplte = conversionMultiplte;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
