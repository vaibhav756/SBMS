package com.daoimpl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
@Service
public class DependentClass {

	@PostConstruct
	public void init()
	{
		System.out.println("Getting Data from DB.");
		System.out.println("Loading Data in Redis Cache.");
	}
	
}