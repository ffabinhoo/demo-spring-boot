package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

	@Bean
	public String getName() {
		String str = "Fabio";
		System.out.println("printing bean " + str);
		return str;
	}
}