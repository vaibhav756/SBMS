package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

	@GetMapping("/")
	public String getWelcomeMessage(Model model)
	{
		model.addAttribute("msg", "Welcome to Thymeleaf page.");
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage(Model model)
	{
		model.addAttribute("msg", "Good Evening...!!");
		return "index";
	}
	
}
