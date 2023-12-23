package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCOnLoadObjectCreation {

	public static void main(String[] args) {
		System.out.println("When we start IOC it will create only Singleton scope bean object.");
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		//System.out.println("When we call context.getBean() method it will create prototype scope bean object.");
		//DieselEngine diesel = context.getBean(DieselEngine.class);
		
		
	}

}
