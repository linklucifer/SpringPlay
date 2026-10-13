package com.lucifer.SpringSecurityExample;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to World " + request.getSession().getId();
    }
}

/* When we add a spring security dependency, we will get a by default login page offered by Spring Security.
* Spring security has many in-built filters which can be modified later as per the requirement.
* When a client send a request, a filter checks whether the user is logged in or not. If a user in not logged in it will send a login form
* If a user is already logged in it will pass the request further to the controllers */