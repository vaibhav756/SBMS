package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.daoimpl.AnnotationBased;

public class AnnotationBasedMainClass {

	public static void main(String[] args) {
		//Use to perform Bean life cycle using annotation based
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		/*AnnotationBased annot = context.getBean(AnnotationBased.class);
		annot.getData();
		
		ConfigurableApplicationContext cont=(ConfigurableApplicationContext)context;
		cont.close();
		*/
		
		//To test DependsOn annotation
		
		
	}

}
