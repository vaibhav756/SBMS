package com.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.dto.Bill;
import com.dto.Order;
import com.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	private String BOOK_ORDER="http://localhost:8081/bookorder";
	
	private String GET_ORDER="http://localhost:8081/getBill?orderid={orderid}";
	
	@Override
	public Bill bookOrder(Order ord) {
		
		//Get proxy implementation for WebClient(Implementation class)
		WebClient client = WebClient.create();
		Bill bill = client.post()
		.uri(BOOK_ORDER)
		.bodyValue(ord)
		.retrieve()
		.bodyToMono(Bill.class)
		.block();
		
		
		//Send Post request and map response to Ticekt object
		//client.post()
		
		/*RestTemplate rt=new RestTemplate();
		ResponseEntity<Bill> response = rt.postForEntity(BOOK_ORDER, ord, Bill.class);
		Bill bill=response.getBody();
		return bill;*/
		return bill;
	}

	@Override
	public Bill getOrder(Integer orderid) {
		
		WebClient client = WebClient.create();
		Bill bill = client.get()
		.uri(GET_ORDER,orderid)
		.retrieve().
		bodyToMono(Bill.class)
		.block();
		
		
		/*RestTemplate rt=new RestTemplate();
		ResponseEntity<Bill> response = rt.getForEntity(GET_ORDER,Bill.class,orderid);
		Bill bill = response.getBody();
		return bill;*/
		return bill;
	}

}
