package com;

public class SodaxoCardPayment implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment done through SodaxoCard...");
	}

}
