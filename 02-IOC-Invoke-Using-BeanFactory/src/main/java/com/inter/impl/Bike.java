package com.inter.impl;

import com.inter.IEngine;

public class Bike implements IEngine {

	public Bike() {
		System.out.println("Bike class constructor executed...");
	}
	
	public void start() {
		System.out.println("Bike has been started...");
	}

}
