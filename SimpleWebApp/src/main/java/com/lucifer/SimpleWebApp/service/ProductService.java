package com.lucifer.SimpleWebApp.service;

import com.lucifer.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
//    creating some dummy data
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "iPhone", 90000),
        new Product(102, "Samsung", 98000),
        new Product(103, "Xiaomi", 55000)));

//    to get all the products
    public List<Product> getProducts() {
        return products;
    }

//    to get the one particular product
    public Product getProductById(int prodId) {
//        we are using orElse() method to tackle if any product is not present then it can return a dummy data with no item found msg
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(1100, "NO ITEM", 0));
    }

//    send data and stored in the list
    public void addProduct(Product prod) {
        products.add(prod);
    }

//    update the data in the list
    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
    }
}

// it's just a learning project application so to keep the things simple and easy to understand we are not following the DRY principal
// but in real life don't repeat the same code
