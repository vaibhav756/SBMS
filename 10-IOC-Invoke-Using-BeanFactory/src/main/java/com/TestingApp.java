package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.service.PaymentService;

public class TestingApp {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("Beans.xml");  //If file is available in ClassPath
		//Resource rs=new FileSystemResource("Beans.xml");  //If file is not available in ClassPath
		BeanFactory factory=new XmlBeanFactory(rs);
		PaymentService payment = factory.getBean(PaymentService.class);
		payment.doPayment();
		
		
	}

}