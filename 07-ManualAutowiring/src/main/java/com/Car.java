package com;

public class Car {

	private IEngine eng;
	
	public Car()
	{
		
	}
	
	public Car(IEngine eng)
	{
		this.eng=eng;
	}
	
	public void setEng(IEngine eng)
	{
		this.eng=eng;
	}
	
	public void start()
	{
		eng.type();
	}
}
