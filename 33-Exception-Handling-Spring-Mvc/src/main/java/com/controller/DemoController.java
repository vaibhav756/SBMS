package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	//rivate Logger logger=LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/wish")
	public String getWishMsg(Model model)
	{
		String msgTxt="Wish you happy birthday.";
		//int val=10/0;
		String name=null;
		String firstName=name.substring(10);
		model.addAttribute("msg", msgTxt);
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model)
	{
		String msgTxt="Good Evening...";
		int val=10/0;
		model.addAttribute("msg", msgTxt);
		return "index";
	}
	//Local Exception Handling
	/*@ExceptionHandler(value=ArithmeticException.class)
	public String handleAE(ArithmeticException ae,Model model)
	{
		logger.error(ae.getMessage());
		model.addAttribute("msg",ae.getMessage());
		return "errorpage";
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handlNPE(NullPointerException npe,Model model)
	{
		logger.error(npe.getMessage());
		System.out.println(npe.getCause());
		model.addAttribute("error","Null Pointer Exception");
		return "npepage";
	}*/
	
}
