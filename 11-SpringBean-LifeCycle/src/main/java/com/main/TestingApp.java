package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoimpl.AnnotationBased;
import com.daoimpl.User;

public class TestingApp {

	public static void main(String[] args) {

		//Bean Life Cycle using Xml approach
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		//UserDaoImpl user = context.getBean(UserDaoImpl.class);
		//user.getData();
		
		//Bean Life Cycle using Programming approach
		//User usr = context.getBean(User.class);
		//usr.getData();
		
		//Bean Life Cycle using Annotation approach
		AnnotationBased ab=context.getBean(AnnotationBased.class);
		ab.getData();
		
		ConfigurableApplicationContext confcontext=(ConfigurableApplicationContext)context;
		confcontext.close();
		
		
		
	}

}
