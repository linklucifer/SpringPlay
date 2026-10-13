package com.lucifer.SimpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/* Instead of creating getters and setters we use Lombok library
*  Project Lombok is a popular Java library frequently used in Spring Boot applications to drastically reduce repetitive, "boilerplate" code*/

@Data
@AllArgsConstructor
@ToString
public class Product {
    private int prodId;
    private String prodName;
    private int price;

}
