package com.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private DataSource datasource;
	
	@Autowired
	public void authManager(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.jdbcAuthentication()
		.dataSource(datasource)
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("select username,password,enabled from users where username=?")
		.authoritiesByUsernameQuery("select username,authority from authorities where username=?");
	}
	
	@Bean
	public SecurityFilterChain secure(HttpSecurity http)throws Exception
	{
		http.authorizeHttpRequests(req->
			req.antMatchers("/welcome").permitAll().antMatchers("/admin").hasRole("ADMIN").antMatchers("/user").hasAnyRole("ADMIN","USER").anyRequest().authenticated()
		).formLogin();
		return http.build();
	}
	
}
