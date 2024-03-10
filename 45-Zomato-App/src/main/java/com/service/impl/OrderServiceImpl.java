package com.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dto.Bill;
import com.dto.Order;
import com.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	private String BOOK_ORDER="http://localhost:8081/bookorder";
	
	private String GET_ORDER="http://localhost:8081/getBill?orderid={orderid}";
	
	@Override
	public Bill bookOrder(Order ord) {
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Bill> response = rt.postForEntity(BOOK_ORDER, ord, Bill.class);
		Bill bill=response.getBody();
		return bill;
	}

	@Override
	public Bill getOrder(Integer orderid) {
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Bill> response = rt.getForEntity(GET_ORDER,Bill.class,orderid);
		Bill bill = response.getBody();
		return bill;
	}

}
