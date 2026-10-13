package com.lucifer.RevisionSpringJDBC;

import com.lucifer.RevisionSpringJDBC.model.Alien;
import com.lucifer.RevisionSpringJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RevisionSpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RevisionSpringJdbcApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(225);
		alien1.setName("Boss Baby");
		alien1.setTech("DataBase");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());
	}

}
