package com.daoimpl;

import com.dao.IPayment;

public class DebitCard implements IPayment {

	public DebitCard() {
		System.out.println("Debit Card Constructor executed...");
	}
	
	public void processpayment() {
		System.out.println("Payment done through DebitCard.");
	}

}
