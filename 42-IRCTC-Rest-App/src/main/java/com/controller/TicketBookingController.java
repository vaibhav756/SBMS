package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Passenger;
import com.dto.Ticket;
import com.service.TicketBookingService;

@RestController
public class TicketBookingController {

	@Autowired
	private TicketBookingService ser;
	
	@PostMapping(value="bookticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger pass)
	{
		Ticket bookTicket = ser.bookTicket(pass);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);
	}
	
	@GetMapping(value="getTicket")
	public ResponseEntity<Ticket> getTicket(@RequestParam("ticketno") Integer ticketno)
	{
		Ticket ticket = ser.getTicket(ticketno);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
	
}
