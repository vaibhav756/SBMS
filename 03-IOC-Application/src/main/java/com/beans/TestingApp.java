package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService payment = context.getBean(PaymentService.class);
		payment.doPayment(2000.00);
		
		
	}

}
