package com.currency.currencyexchangeservice.controller;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class ExchangeValue {

	
	@Column(name="currency_from")
	private String from;
	private String to;
	@Id
	private Long id;
	private Double conversionRate;
	private Integer port;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public ExchangeValue(String from, String to, Long id, Double conversionRate) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionRate = conversionRate;
	}

	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}
}
