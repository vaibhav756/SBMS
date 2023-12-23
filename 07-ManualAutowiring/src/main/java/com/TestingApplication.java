package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Car carbean = context.getBean(Car.class);
		//If autowire="byName" Based on name of the variable in target class it will match id in Beans.xml and it will inject that object
		//If autowire="byType" then based on Type of the variable it will identify dependent bean.If interface having 2 implementation classes then to overcome ambiguity problem we need to define one class as Primary(primar"true")
		//If autowire="constructor" then first it will check byName,If no bean matching with byName then it will go with byType mode.
		carbean.start();
	}

}
