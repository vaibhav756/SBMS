package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	//Only Admin role user can access this method
	@GetMapping("/admin")
	public String Admin()
	{
		return "Welcome to admin dashboard.";
	}
	//Admin/User role user can access this method
	@GetMapping("/user")
	public String User(){
		return "Welcome to user dashboard.";
	}
	//Any role user can access this method
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome...!!!";
	}
}
