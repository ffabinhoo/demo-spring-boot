package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beans {
	private final String NAME   = "Fabio";
	private final String NUMBER = "12345";
	private List<String> colors;

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

	@Bean
	public List<String> getColour() {
		colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		return colors;
	}

}