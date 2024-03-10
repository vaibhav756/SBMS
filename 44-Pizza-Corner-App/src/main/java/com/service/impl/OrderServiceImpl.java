package com.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dto.Bill;
import com.dto.Order;
import com.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	private Map<Integer,Bill> map=new HashMap<>();
	
	private Integer orderid=101;
	
	@Override
	public Bill bookOrder(Order ord) {
		Bill bill=new Bill();
		bill.setName(ord.getName());
		bill.setEmail(ord.getEmail());
		bill.setFood(ord.getFood());
		bill.setMobno(ord.getMobno());
		bill.setOrderid(orderid++);
		bill.setOrderstatus("Confirmed");
		bill.setPrice(500);
		bill.setQuantity(ord.getQuantity());
		map.put(bill.getOrderid(), bill);
		return bill;
	}

	@Override
	public Bill getOrder(Integer orderid) {
		Bill bill = map.get(orderid);
		return bill;
	}

}
