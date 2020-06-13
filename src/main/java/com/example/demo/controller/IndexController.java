package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Beans;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	private Beans beans;
	
	@GetMapping
	public String index() {
		return "Index from Beans (" + beans.getName() + ")";
	}
	
	@GetMapping("/number")
	public String number() {
		return "Number from Beans (" + beans.getNumber() + ")";
	}
	
}
