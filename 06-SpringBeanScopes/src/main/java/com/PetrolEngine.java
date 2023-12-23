package com;

public class PetrolEngine implements IEngine {

	public PetrolEngine()
	{
		System.out.println("PetrolEngine constructor executed...");
	}
	
	public int start() {
		System.out.println("Car has Petrol Engine...");
		return 1;
	}

}
