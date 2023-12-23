package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.config.AppConfig;

public class TestingApp {

	public static void main(String[] args) {
/*		ApplicationContext context=new ClassPathXmlApplicationContext("");*/
		//As we don't have any BeanConfiguration class we are not using this approach
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
