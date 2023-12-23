package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.dao.ReportService;

public class TestingApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService bean = context.getBean(ReportService.class);
		bean.generateReport();
	}

}
