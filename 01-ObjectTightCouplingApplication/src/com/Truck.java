package com;

public class Truck {
	//As we are passing object manually it is tightly coupled.
	//private IEngine eng=new DieselEngine();
	//private IEngine eng=new PetrolEngine();
	//private IEngine eng=new ElectricEngine();

	IEngine eng;
	//Constructor Injection
	/*public Truck(IEngine eng)
	{
		this.eng=eng;
	}*/
	
	//Setter Injection
	/*public void setIEngine(IEngine eng)
	{
		this.eng=eng;
	}*/
	
	
	
	public void run()
	{
		//Loosely Coupling
				//IEngine eng=new DieselEngine();
				//IEngine eng=new PetrolEngine();
				//IEngine eng=new ElectricEngine();
				eng.start();
	}
	
}
