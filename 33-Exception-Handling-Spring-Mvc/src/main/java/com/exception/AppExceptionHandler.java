package com.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	private Logger logger=LoggerFactory.getLogger(AppExceptionHandler.class);
	
	//Global Exception Handling 
	
	@ExceptionHandler(value=ArithmeticException.class)
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
	}
	
}
