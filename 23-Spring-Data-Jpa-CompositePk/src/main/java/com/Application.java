package com;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.TutionPk;
import com.entity.VkyTution;
import com.repository.VkyTutionRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(Application.class, args);
		VkyTutionRepository repo = cont.getBean(VkyTutionRepository.class);
		
		VkyTution tution=new VkyTution();
		tution.setStudName("Vaibhav Yadav");
		tution.setCoursePrice(5000.00);
		
		TutionPk pk=new TutionPk();
		pk.setStudPan("ANAPY9997R");
		pk.setCourseName("Marathi");
		
		tution.setTutionPk(pk);
		
		//repo.save(tution);
		
		TutionPk pk1=new TutionPk();
		pk1.setStudPan("ANAPY9997R");
		pk1.setCourseName("Marathi");
		
		Optional<VkyTution> tution1 = repo.findById(pk1);
		if(tution1.isPresent())
		System.out.println(tution1.get());
	}

}
