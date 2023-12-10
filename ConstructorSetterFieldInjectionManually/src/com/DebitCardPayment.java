package com;

public class DebitCardPayment implements IPayment{

	@Override
	public void pay() {
		System.out.println("Payment done through Debitcard...");
	}

}
