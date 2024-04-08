package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private MyUserDetailsService service;
	
	@Autowired
	public void ConfigureUsers(AuthenticationManagerBuilder auth)throws Exception
	{
		auth.userDetailsService(service).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	@Bean
	public SecurityFilterChain secure(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(req->{
			req.antMatchers("/contact").permitAll().anyRequest().authenticated();
		}).formLogin();
		return http.build();
	}
	
}
