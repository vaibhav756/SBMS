package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Bill;
import com.dto.Order;
import com.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService ser;
	
	@PostMapping("/bookorder")
	public ResponseEntity<Bill> bookOrder(@RequestBody Order ord)
	{
		Bill bill = ser.bookOrder(ord);
		return new ResponseEntity<Bill>(bill,HttpStatus.CREATED);
	}
	
	@GetMapping("/getBill")
	public ResponseEntity<Bill> getBill(@RequestParam("orderid") Integer orderid)
	{
		Bill bill = ser.getOrder(orderid);
		return new ResponseEntity<Bill>(bill,HttpStatus.OK);
	}
	
}
