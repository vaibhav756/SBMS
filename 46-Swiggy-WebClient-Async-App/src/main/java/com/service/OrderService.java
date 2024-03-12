package com.service;

import com.dto.Bill;
import com.dto.Order;

public interface OrderService {

	public Bill bookOrder(Order ord);
	public Bill getOrder(Integer orderid);

	
}
