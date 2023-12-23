package com;

public class Car {

	IEngine eng;
	
	public Car(IEngine eng)
	{
		System.out.println("Constructor injection executed...");
		this.eng=eng;
	}
	
	public void setEng(IEngine eng)
	{
		System.out.println("Setter injection executed...");
		this.eng=eng;
	}
	
	public void drive()
	{
		int start = eng.start();
		if(start>0)
		System.out.println("Journey started...");
		else
		System.out.println("Engine is having trouble.");
	}
	
}