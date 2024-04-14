package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.filter.JwtRequestFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService myuserdetailsservice;
	
	@Autowired
	private JwtRequestFilter jwtrequestfilter;
	
	public void configureGlobal(AuthenticationManagerBuilder authbuilder) throws Exception
	{
		authbuilder.userDetailsService(myuserdetailsservice);
	}
	
	@Bean
	public PasswordEncoder passwordencoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception
	{
		return super.authenticationManagerBean();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers("/authenticate")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.exceptionHandling()
		.and()
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		http.addFilterBefore(jwtrequestfilter, UsernamePasswordAuthenticationFilter.class);
		
	}
}
