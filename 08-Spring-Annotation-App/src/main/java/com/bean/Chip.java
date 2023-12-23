package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip()
	{
		System.out.println("Chip class constructor executed...");
	}
	
	public String chipType()
	{
		return "32-Bit";
	}
}
