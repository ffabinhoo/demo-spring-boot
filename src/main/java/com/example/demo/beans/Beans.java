package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
	private final String NAME   = "Fabio";
	private final String NUMBER = "12345";

	@Bean
	public String getName() {
		System.out.println("printing bean name " + NAME);
		return NAME;
	}
	
	@Bean
	public String getNumber() {
		System.out.println("printing bean number " + NUMBER);
		return NUMBER;
	}
	
	


}