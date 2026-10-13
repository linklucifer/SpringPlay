package com.lucifer.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/* We use the @Primary annotation in Spring Boot to designate a default bean when multiple beans of the same type exist in the application context
*  When you use @Autowired to inject a dependency, Spring searches its container by type
* @Autowired to inject a dependency, Spring searches its container by type. If you have an interface implemented by multiple classes, Spring encounters an ambiguity issue*/

@Component
@Primary
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling with 404 bugs");
    }
}
