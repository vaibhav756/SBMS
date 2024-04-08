package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	@GetMapping("/")
	public String sayHi()
	{
		return "Hey, How are you?";
	}
	
	@GetMapping("/google")
	public String getGoogleMsg()
	{
		return "Welcome to Google.";
	}
}
