package com.daoimpl;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
@Service
@DependsOn("dependentClass")
public class ATargetClass{

	@PostConstruct
	public void init()
	{
		System.out.println("Fetching Data from Redis.");
	}
	
}
