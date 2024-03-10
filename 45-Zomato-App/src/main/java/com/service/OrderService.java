package com.service;

import org.springframework.stereotype.Service;

import com.dto.Bill;
import com.dto.Order;


public interface OrderService {

	public Bill bookOrder(Order ord);
	public Bill getOrder(Integer orderid);
	
}
