package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

	@GetMapping("welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Welcome to Mumbai.");
		mv.setViewName("Message");
		return mv;
	}
	
	@PostMapping("/greet")
	public ModelAndView getGreetMsg()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Greeting from Vaibhav Yadav.");
		mv.setViewName("Message");
		return mv;
	}
	
}
