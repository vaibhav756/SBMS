package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/greet")
	public String greetMsg()
	{
		return "Good Evening...!!!";
	}
	
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		return "Welcome to Mumbai...!!!";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "Contact us : +91 9000000000";
	}
	
}
