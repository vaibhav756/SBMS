package com.daoimpl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class AnnotationBased {

	@PostConstruct
	public void init()
	{
		System.out.println("Getting DB Connection...");
	}
	
	public void getData()
	{
		System.out.println("Getting data from DB...");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Closing DB Connection...");
	}
	
}
