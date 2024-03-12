package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		int val=10/0;
		return "Welcome to REST API...!!!";
	}
	
	@GetMapping("/getBalance")
	public String getBalance(@RequestParam("accno") String accno)
	{
		String acc=null;
		acc.toLowerCase();
		Integer accountno=Integer.valueOf(acc);
		return "Account balance is 10000";
	}
}
