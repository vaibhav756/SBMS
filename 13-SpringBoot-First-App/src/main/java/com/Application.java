package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getClass().getName());
		
		//ReportService rs = context.getBean(ReportService.class);
		//System.out.println(rs.hashCode());
	}
	
	@GetMapping("/greet")
	public String greet()
	{
		return "Welcome to First Application.";
	}

}
