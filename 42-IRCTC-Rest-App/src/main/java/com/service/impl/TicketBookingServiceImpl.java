package com.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dto.Passenger;
import com.dto.Ticket;
import com.service.TicketBookingService;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {

	private Map<Integer,Ticket> map=new HashMap<>();
	private Integer ticketNo=101;
	
	@Override
	public Ticket bookTicket(Passenger pass) {
		
		Ticket ticket=new Ticket();
		ticket.setName(pass.getName());
		ticket.setFrom(pass.getFrom());
		ticket.setTo(pass.getTo());
		ticket.setTicketno(ticketNo++);
		ticket.setCost(2000.00);
		ticket.setDoj(LocalDate.now().toString());
		ticket.setStatus("Confirmed");
		ticket.setTrainno(pass.getTrainno());
		map.put(ticket.getTicketno(), ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketno) {
		Ticket ticket = map.get(ticketno);
		return ticket;
	}

}
