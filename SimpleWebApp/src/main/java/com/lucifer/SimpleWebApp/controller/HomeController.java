package com.lucifer.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// The @RestController annotation marks a Java class as a request handler specifically for RESTful web services
@RestController
public class HomeController {

//    The @RequestMapping annotation is used to route HTTP requests to specific classes or methods by matching URL paths
    @RequestMapping("/")
    public String greet() {
        return "Welcome to Lucifer's Home";
    }

    @RequestMapping("/about")
    public String about() {
        return "We don't teach, we Educate!";
    }
}
