package com.example.demo.controller;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public Iterable<Product> productAll() {
        return productService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> productFindOne(@PathVariable("id") Integer id) {
        return productService.findOne(id);
    }

    @GetMapping(path = "/search/{description}")
    public Iterable<Product> productFindDescription(@PathVariable("description") String description) {
        return productService.findByDescriptionContaining(description);
    }


    @PostMapping(path = "/add")
    public String productAdd(@RequestBody Product product) {
        Product productnew = productService.save(product);

        if (null != productnew.getId()) {
            return " success " + productnew.getDescription() + " with id: " + product.getId() + " created";
        } else {
            return " fail";
        }
    }
}
