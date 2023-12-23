package com.beans;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment()
	{
		System.out.println("DebitCard constructor executed...");
	}
	
	public void processPayment(Double amt) {
		//Logic to deduct amount from card.
		System.out.println("Debit Card Payment Successfull for rupees : "+amt);
	}

}
