package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public Iterable<Product> productAll() {
		return productService.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Product> productFindOne(@PathVariable("id")  Integer id){
		return productService.findOne(id);
	}
	
	
	@PostMapping(path="/add")
	public String productAdd(@RequestBody Product product) {
		Product productnew = productService.save(product);
		
		if (null!=productnew.getId() && null!= product.getId()) {
			return " success " + productnew.getDescription() + " with id: " + product.getId() + " updated";
		}else if (null!=productnew.getId()) {
			return " success " + productnew.getDescription() + " with id: " + product.getId() + " created";
		}else {
			
			return " fail" ;
		}
		
	}

}
