package com;

public class MainApp {

	public static void main(String[] args) {

		//Setter Injection
		//Bill b=new Bill();
		//b.setIPayment(new DebitCardPayment());
		//b.setIPayment(new CreditCardPayment());
		
		//Constructor Injection
		//Bill b=new Bill(new SodaxoCardPayment());
		//b.payBill();
		
		//Field Injection
		Bill b=new Bill();
		b.pay=new DebitCardPayment();
		b.payBill();
		
	}

}
