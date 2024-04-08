package com.rest;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/getmsg")
	public String getMessage()
	{
		return "Welcome to Mumbai.";
	}
	
	@GetMapping("/contactus")
	public String contactUs()
	{
		return "Contact Us Page.";
	}
	
}
