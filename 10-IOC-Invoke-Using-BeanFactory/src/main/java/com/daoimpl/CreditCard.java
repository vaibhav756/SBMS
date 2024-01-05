package com.daoimpl;

import com.dao.IPayment;

public class CreditCard implements IPayment {

	public CreditCard() {
		System.out.println("Credit Card constructor executed...");
	}
	
	public void processpayment() {
		System.out.println("Payment done through Credit Card.");
	}

}
