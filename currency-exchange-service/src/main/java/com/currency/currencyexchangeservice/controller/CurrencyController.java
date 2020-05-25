package com.currency.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private Environment env;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = getValue(from, to);
		String property = env.getProperty("local.server.port");
		exchangeValue.setPort(Integer.parseInt(property));
		return exchangeValue;
	}

	private ExchangeValue getValue(String from, String to) {
		return new ExchangeValue(from,to,10L,75.0);
	}
}
