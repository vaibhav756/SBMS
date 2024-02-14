package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.Person;
import com.repository.PersonRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		PersonRepository repo = context.getBean(PersonRepository.class);
		Person p1=new Person();
		p1.setPersonName("Amit Devkar");
		p1.setPersonAge(28);
		
		repo.save(p1);
		
	}

}
