package com;

public class CreditCardPayment implements IPayment{
	@Override
	public void pay() {
		System.out.println("Payment done through Creditcard...");
	}
}
