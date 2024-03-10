package com.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.User;

@RestController
public class UserRestController {

	private Map<Integer,User> map=new HashMap<>();
	
	@PostMapping(value="adduser",consumes= {"application/json"})
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		map.put(user.getUid(), user);
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
	}
	
	@GetMapping(value="getUser",produces= {"application/json"})
	public ResponseEntity<User> getUser(@RequestParam("id") Integer uid)
	{
		User user = map.get(uid);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
}
