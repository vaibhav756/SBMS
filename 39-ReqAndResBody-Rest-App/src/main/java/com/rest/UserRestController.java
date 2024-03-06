package com.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.User;

@RestController
public class UserRestController {

	private Map<Integer,User> datamap=new HashMap<>();
	
	//Method with @RequestBody
	@PostMapping("/saveuser")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		System.out.println(user);
		datamap.put(user.getId(), user);
		String body="User saved...!!!";
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	//Method with QueryParam and @RequestParam
	@GetMapping("/getUser")
	public ResponseEntity<User> getUser(@RequestParam("userid") Integer userId)
	{
		User user = datamap.get(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}

	//Method with multiple QueryParam and @RequestParam
	@GetMapping("/getUserByIdAndName")
	public ResponseEntity<User> getUserByIdAndName(@RequestParam("userid") Integer userId,@RequestParam("username") String userName)
	{
		User user = datamap.get(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	//Method with PathParam and @PathParam
	@GetMapping("/user/{userid}")
	public ResponseEntity<User> getUserById(@PathVariable("userid") Integer userId)
	{
		User user = datamap.get(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
}
