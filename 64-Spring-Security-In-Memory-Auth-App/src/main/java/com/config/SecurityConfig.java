package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager configureUsers()
	{
		UserDetails adminUser=User.withDefaultPasswordEncoder().username("vaibhav").password("vaibhav@123").authorities("ADMIN").build();
		
		UserDetails normalUser=User.withDefaultPasswordEncoder().username("rohan").password("rohan@123").authorities("USER").build();
		
		return new InMemoryUserDetailsManager(adminUser,normalUser);
	}
	
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(req->{
			req.antMatchers("/contact").permitAll()
			.anyRequest().authenticated();
		}).formLogin();
		return http.build();
	}
	
}
