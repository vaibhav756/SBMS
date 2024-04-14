package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.AuthenticationRequest;
import com.dto.AuthenticationResponse;
import com.service.MyUserDetailsService;
import com.util.JwtUtil;

@RestController
public class HelloRestController {

	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@Autowired
	private MyUserDetailsService userdetailsservice;
	
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		return "Welcome to Mumbai.";
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest request)throws Exception
	{
		try
		{
			authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword()));
		}catch(Exception e)
		{
			throw new Exception("Incorrect Username or Password",e);
		}
		
		final UserDetails userdetails=userdetailsservice.loadUserByUsername(request.getUsername());
		final String jwt=jwtTokenUtil.generateToken(userdetails);
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
}
