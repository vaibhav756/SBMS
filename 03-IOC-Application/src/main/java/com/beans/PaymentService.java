package com.beans;

public class PaymentService {
	//Interface can hold any implementation class object
	IPayment payment;
	
	public PaymentService()
	{
		System.out.println("PaymentService constructor executed...");
	}
	/*
	public PaymentService(IPayment pay)
	{
		this.payment=pay;
	}*/
	
	public void setPayment(IPayment pay)
	{
		this.payment=pay;
	}
	
	public void doPayment(double billAmt)
	{
		payment.processPayment(billAmt);
		System.out.println("Recipt printing...");
	}
	
}
