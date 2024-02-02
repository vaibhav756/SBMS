package com.service;

import com.inter.IEngine;

public class Vehicle {

	private IEngine engine;
	
	public Vehicle(IEngine engine)
	{
		this.engine=engine;
	}
	
	public void run()
	{
		engine.start();
	}
	
}
