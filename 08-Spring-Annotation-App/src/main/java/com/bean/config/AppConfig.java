package com.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bean.Engine;

@Configuration
@ComponentScan(basePackages= {"com","in"})
//It won't create UserDao class object as it is available in in.dao class.
public class AppConfig {

	@Bean
	public Engine getEngine()
	{
		Engine eng=new Engine();
		return eng;
	}
	
}
