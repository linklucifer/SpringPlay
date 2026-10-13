package com.lucifer.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
//		In Spring, we don't need to create, manage and destroy the object. The framework will do it by itself
//		But first we have to go through these steps
		ApplicationContext context = SpringApplication.run(MyAppApplication.class);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
