package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.Passenger;
import com.dto.Ticket;
import com.service.MakeMyTripService;

@Controller
public class MakeMyTripController {

	@Autowired
	private MakeMyTripService ser;
	
	@GetMapping("/")
	public String loadform(Model model)
	{
		model.addAttribute("passenger",new Passenger());
		return "index";
	}
	
	@PostMapping("/bookticket")
	public String bookTicket(Passenger pass,Model model)
	{
		System.out.println(pass);
		Ticket ticket = ser.bookTicket(pass);
		model.addAttribute("msg", "Ticket has been booked for customer "+ticket.getTicketno());
		return "index";
	}
	
	@GetMapping("/getTicket")
	public String getTicketPage(Model model)
	{
		model.addAttribute("ticket", new Ticket());
		return "Ticket";
	}
	
	@GetMapping("/getTicketByNo")
	public String getTicketByNo(@RequestParam("ticketno") Integer ticketno,Model model)
	{
		Ticket ticket = ser.getTicket(ticketno);
		model.addAttribute("ticket", ticket);
		System.out.println(ticket);
		return "Ticket";
	}
	
	
}
