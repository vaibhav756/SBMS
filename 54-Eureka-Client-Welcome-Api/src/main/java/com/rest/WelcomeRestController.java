package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.feign.inter.GreetFeignClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFeignClient client;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		RestTemplate rt=new RestTemplate();
		//String msg = rt.getForObject("http://localhost:8081/getmsg", String.class);
		String result = client.invokeGreetApi();
		return result+" Welcome response.";
	}

}
