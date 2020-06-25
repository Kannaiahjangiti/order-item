package com.altimetrik.orderservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean
	public RestTemplate getTempalte() {
		return new RestTemplate();
	}

	
	
}
