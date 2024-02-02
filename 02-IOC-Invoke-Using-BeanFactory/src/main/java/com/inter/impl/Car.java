package com.inter.impl;

import com.inter.IEngine;

public class Car implements IEngine {

	public Car() {
		System.out.println("Car class constructor executed...");
	}
	
	public void start() {
		System.out.println("Car has been started...");
	}

}
