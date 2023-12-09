package com;
/*
 * Tightly coupling with IS-A relation
public class Car extends Engine{

	public void drive()
	{
		int status = super.start();
		if(status>0)
		System.out.println("Car Started...");
		else
		System.out.println("Engine Trouble...");	
	}
	
}*/
//Tightly coupling with HAS-A relation
public class Car
{
	public void drive()
	{
		Engine eng=new Engine();
		int status=eng.start();
		if(status>0)
		System.out.println("Car Started...");
		else
		System.out.println("Engine Trouble...");
	}
}