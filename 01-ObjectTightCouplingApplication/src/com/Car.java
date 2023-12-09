package com;

public class Car extends Engine{

	public void drive()
	{
		int status = super.start();
		if(status>0)
		System.out.println("Car Started...");
		else
		System.out.println("Engine Trouble...");	
	}
	
}
