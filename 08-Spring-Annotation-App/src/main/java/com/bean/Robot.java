package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	@Autowired
	private Chip chip;
	
	public Robot()
	{
		System.out.println("Robot class constructor executed...");
	}
	
	public void doWork()
	{
		String type = chip.chipType();
		if(type.equals("32-Bit"))
		System.out.println("Performance is slow.");
		else
		System.out.println("Performance is good.");
	}
	
}
