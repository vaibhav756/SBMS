package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exception.UserNotFoundException;

@RestController
public class UserController {

	@GetMapping("/getUserById")
	public String getUserName(@RequestParam("userid") Integer id) throws Exception
	{
		if(id==101)
		{
			return "John";
		}else if(id==102)
		{
			return "Amar";
		}else
		{
			throw new UserNotFoundException("User Not Found.");
		}
	}
	
}
