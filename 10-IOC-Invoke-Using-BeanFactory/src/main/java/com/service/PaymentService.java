package com.service;

import com.dao.IPayment;

public class PaymentService {
	
	IPayment pay;
	
	/*public PaymentService(IPayment pay) {
		this.pay=pay;
	}*/
	
	public void setPay(IPayment pay)
	{
		this.pay=pay;
	}
	
	public void doPayment()
	{
		pay.processpayment();
	}

}
