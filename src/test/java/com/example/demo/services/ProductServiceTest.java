package com.example.demo.services;

import com.example.demo.entities.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Resource
    ProductService productService;

    @Test
    public void findAllTest(){
        Iterable<Product> ret = productService.findAll();
        Assert.assertNotNull(ret);
    }

    @Test
    public void saveProductTest(){
        Product productNew = new Product();
        productNew.setId(1);
        productNew.setDescription("eu");
        Product product = productService.save(productNew);
Assert.assertTrue(product.getDescription().contains("eu"));
    }

}
