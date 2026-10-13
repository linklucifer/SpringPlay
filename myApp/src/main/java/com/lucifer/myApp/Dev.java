package com.lucifer.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Spring doesn't create the objects itself, we have to instruct the spring that which object we needed, and we have to mark that class as a component
// By using this annotation, now spring will manage the object of Dev and that managed object is called bean
@Component
public class Dev {

//    Dev is dependent on the laptop, and we want its object to connect, so we can use Autowired
    /* It tells the Spring IoC (Inversion of Control) container to automatically find and inject a matching bean (object) into your class,
       removing the need to manually instantiate objects using the new keyword. */

    @Autowired  // field injection

//    We use the @Qualifier annotation in Spring Boot to resolve ambiguity when multiple beans of the same type exist in the application context
    @Qualifier("laptop")
    private Computer comp;

//    private Laptop laptop;

//    if you don't want to use @Autowired filed injection, you can use Constructor injection instead. This will also work
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    just like Constructor injectio, we have another injection called setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        comp.compile();
        System.out.println("Working on Awesome Project");
    }

}

/* Jis v class ka ham object banwana chahte hai Spring se to pehle ham uss class ko as a @Component annotate karna padega */
// Using @Component we can create objects but using @Autowired we can connect it

// Constructor injection by default has @Autowired but for the setter injection and field injection you have to annotate them as @Autowired
// Constructor and Setter injections are better than field injection
