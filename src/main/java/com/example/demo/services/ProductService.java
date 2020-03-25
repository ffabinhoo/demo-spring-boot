package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public Optional<Product> findOne(Integer id) {
		return productRepository.findById(id);
	}

	public Iterable<Product> findAll() {
		return productRepository.findAll();
		
	}

	public Product save(Product product) {
		return productRepository.save(product);
	}

}
