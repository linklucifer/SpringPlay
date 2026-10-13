package com.lucifer.SimpleWebApp.controller;

import com.lucifer.SimpleWebApp.model.Product;
import com.lucifer.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller doesn't do the operations by itself. It just takes the requests and send it to the service to perform the operations

@RestController
public class ProductController {

    @Autowired
    ProductService service;

//    by this we can fetch the entire products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }


//    fetch one particular product using its id
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

//    send the data using PostMapping method
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        service.addProduct(prod);
    }
//    update the data in the list
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

//    delete a product from the list using its prodId
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}
