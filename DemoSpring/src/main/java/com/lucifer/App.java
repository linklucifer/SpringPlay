package com.lucifer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        to use the spring and its object manager first we need to have Ioc Container and for that we have to use ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        in this getBean() method you have to specify the bean name that we want its object
        Dev obj = (Dev) context.getBean("dev");

//        in case we don't want to assign the value here and want to do it using spring, we can do it in spring.xml file
//        obj.setAge(23);
//        System.out.println(obj.getAge());
        obj.build();


    }
}

// In this project nothing have configured. We are using a simple Maven project but still we want to use spring
// To work with the Spring framework we have to add its dependencies

// EVERY CLASS THAT SPRING MANAGES THEY ARE CALLED SPRING BEANS OR BEANS