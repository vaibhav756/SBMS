package com;

public class Bill {

	IPayment pay;
	//Dependency injection using setter method
	/*public void setIPayment(IPayment pay)
	{
		this.pay=pay;
	}*/
	
	//Dependency injection using Constructor
	/*public Bill(IPayment pay)
	{
		this.pay=pay;
	}*/
	
	public void payBill()
	{
		pay.pay();
	}
	
}
