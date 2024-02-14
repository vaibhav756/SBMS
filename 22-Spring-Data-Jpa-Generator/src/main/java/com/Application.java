package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vky.entity.Teacher;
import com.vky.repository.TeacherRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(Application.class, args);
		TeacherRepository repo = cont.getBean(TeacherRepository.class);
		
		Teacher t1=new Teacher();
		t1.setTeacherName("Ram Pawar");
		t1.setTeacherEmail("rampawar123@@gmail.com");
		t1.setTeacherFullName("Ram Arjun Pawar");
		repo.save(t1);
		
	}

}
