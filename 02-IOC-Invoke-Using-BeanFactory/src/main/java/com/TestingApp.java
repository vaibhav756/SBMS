package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestingApp {

	public static void main(String[] args) {
		//ApplicationContext cont=new ClassPathXmlApplicationContext("Beans.xml");  Eager loading
		Resource resource=new ClassPathResource("Beans.xml");
		BeanFactory factory=new XmlBeanFactory(resource);  // BeanFactory performs lazyloading
		
	}

}
