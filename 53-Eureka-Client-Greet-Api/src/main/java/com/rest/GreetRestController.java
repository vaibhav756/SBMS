package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/getmsg")
	public String getGreetMsg()
	{
		return "Good Morning "+env.getProperty("server.port");
	}
	
}
