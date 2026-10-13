package com.lucifer.SpringDataJPA.controller;

import com.lucifer.SpringDataJPA.model.Product;
import com.lucifer.SpringDataJPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

//    fetch the entire products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

//    fetch a specific product by its Id
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

//    send the data
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        service.addProduct(prod);
    }

//    update the product
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

//    delete the product by its Id
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}
