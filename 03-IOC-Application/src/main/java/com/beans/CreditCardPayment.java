package com.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment()
	{
		System.out.println("CreditCard constructor executed...");
	}

	public void processPayment(Double amt) {
		//Logic to deduct amount from card
		System.out.println("Credit Card Payment Successfull for rupees : "+amt);
	}

}
