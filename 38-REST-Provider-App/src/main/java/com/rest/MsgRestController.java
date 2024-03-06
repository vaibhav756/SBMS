package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String msg="Welcome to Rest Api...!!!";
		return msg;
	}
	
	@PostMapping("/greet")
	public String getGreetMsg()
	{
		String msg="Greeting from India.";
		return msg;
	}
	
	@PostMapping("/savestudent")
	public ResponseEntity<String> savestud()
	{
		String body="Student Saved...";
		return new ResponseEntity<String>(body, HttpStatus.CREATED);
	}
	
}
