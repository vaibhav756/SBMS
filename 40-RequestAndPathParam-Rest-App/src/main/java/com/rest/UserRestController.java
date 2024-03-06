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

	private Map<Integer,User> map=new HashMap<Integer,User>();
	
	//@RequestBody annotation to get bulk data from HTTP Request Body
	@PostMapping("/addUser")
	public ResponseEntity<User> saveuser(@RequestBody User user)
	{
		map.put(user.getId(), user);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	}
	
	
	//Request Param method and @RequestParam
	@GetMapping("/getUserById")
	public ResponseEntity<User> getUser(@RequestParam("id") Integer userId)
	{	
		User user = map.get(userId);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}

	//RequestParam with Multiple values
	@GetMapping("/getUserWithMultipleReqParam")
	public ResponseEntity<User> getUserByIdAndName(@RequestParam("id") Integer id,@RequestParam("name") String name)
	{
		User user = map.get(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	//PathParam with @PathParam
	@GetMapping("/getUserByPath/{id}")
	public ResponseEntity<User> getUserByPath(@PathVariable("id") Integer id)
	{
		User user = map.get(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	//PathParam with multiple @PathParam
	@GetMapping("/getUserByIdAndName/{id}/user/{name}")
	public ResponseEntity<User> getUserByIdAndNameUsingPath(@PathVariable("id") Integer id,@PathVariable("name") String name)
	{
		User user = map.get(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
