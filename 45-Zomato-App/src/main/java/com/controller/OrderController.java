package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.Bill;
import com.dto.Order;
import com.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService ser;
	
	@GetMapping("/")
	public String getHome(Model model)
	{
		model.addAttribute("order",new Order());
		return "index";
	}
	
	@PostMapping("/bookorder")
	public String bookOrder(Order ord,Model model)
	{
		Bill bill = ser.bookOrder(ord);
		model.addAttribute("order",new Order());
		model.addAttribute("msg", "Order has been booked with order id : "+bill.getOrderid());
		return "index";
		
	}
	
	@GetMapping("/getorderdtls")
	public String getOrderDetailsPage(Model model)
	{
		model.addAttribute("bill", new Bill());
		return "orderdtls";
	}
	
	@GetMapping("/getorderdtlsbyorderid")
	public String getOrderDetails(@RequestParam("orderid") Integer orderid,Model model)
	{
		Bill bill = ser.getOrder(orderid);
		model.addAttribute("bill",bill);
		return "orderdtls";
	}
	
}
