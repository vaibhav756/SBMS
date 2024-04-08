package com.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecurityClientRestController {

	private final String secure="http://localhost:8081/getmsg"; 
	
	@GetMapping("/getmsg")
	public String getWelcomeMsg()
	{
		RestTemplate rt=new RestTemplate();
		HttpHeaders head=new HttpHeaders();
		String auth="Basic dXNlcjowYTI0MTI3Ny03MjYwLTRkZDYtOTFiYS04NzY3ZDY4ZjIwOTc=";
		head.set("Authorization",auth);
		HttpEntity ent=new HttpEntity<>(head);
		ResponseEntity<String> exchange = rt.exchange(secure, HttpMethod.GET, ent, String.class);
		return exchange.getBody();
	}
	
}
