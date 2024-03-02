package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@GetMapping("/user")
	public @ResponseBody String greetUser()
	{
		int val=10/0;
		return "Hello User,Welcome to mumbai.";
	}
	
}
