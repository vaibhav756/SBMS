package com;

public class MainApp {

	public static void main(String[] args) {

		//Tightly Coupling
		Car c=new Car();
		c.drive();
		
		//Constructor Injection
		//Truck t=new Truck(new ElectricEngine());
		
		Truck t=new Truck();
		//Setter Injection
		//t.setIEngine(new PetrolEngine());
		
		//Field Injection
		t.eng=new DieselEngine();

		t.run();
		
	}

}
