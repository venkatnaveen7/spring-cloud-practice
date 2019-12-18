package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.bean.LimitConfiguration;
import com.practice.config.Configuration;

@RestController
public class LimitConfigurationResource {

	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimits() {
		return new LimitConfiguration(config.getMinimum(),config.getMaximum());
	}
	
}
