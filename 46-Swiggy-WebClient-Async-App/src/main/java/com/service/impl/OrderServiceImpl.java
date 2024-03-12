package com.service.impl;

import org.springframework.web.reactive.function.client.WebClient;

import com.dto.Bill;
import com.dto.Order;
import com.service.OrderService;

import reactor.core.Disposable;

public class OrderServiceImpl implements OrderService {

	private String BOOK_ORDER="http://localhost:8081/bookorder";
	
	private String GET_ORDER="http://localhost:8081/getBill?orderid={orderid}";
	
	@Override
	public Bill bookOrder(Order ord) {
		
		WebClient client = WebClient.create();
		Disposable subscribe = client.post()
		.uri(BOOK_ORDER)
		.bodyValue(ord)
		.retrieve()
		.bodyToFlux(Bill.class)
		.subscribe();
		
		
		return null;
	}

	@Override
	public Bill getOrder(Integer orderid) {
		
		WebClient client = WebClient.create();
		System.out.println("Request sending start");
		Disposable subscribe = client.get()
		.uri(GET_ORDER,orderid)
		.retrieve()
		.bodyToFlux(Bill.class)
		.subscribe();
		System.out.println("Request sending end");
		return null;
	}
}
