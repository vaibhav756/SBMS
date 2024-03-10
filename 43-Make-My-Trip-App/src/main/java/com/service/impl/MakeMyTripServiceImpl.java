package com.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dto.Passenger;
import com.dto.Ticket;
import com.service.MakeMyTripService;
@Service
public class MakeMyTripServiceImpl implements MakeMyTripService{
	
	private String BOOK_TICKET_URL="http://localhost:8081/bookticket";
	
	private String GET_TICKET_URL="http://localhost:8081/getTicket?ticketno={ticketno}";
	
	@Override
	public Ticket bookTicket(Passenger pass) {
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> entity = rt.postForEntity(BOOK_TICKET_URL,pass,Ticket.class);
		Ticket ticket = entity.getBody();
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketno) {
		RestTemplate rt=new RestTemplate();
		Map map=new HashMap<String,Integer>();
		map.put("ticketno", ticketno);
		ResponseEntity<Ticket> entity=null;
		try
		{
			 entity = rt.getForEntity(GET_TICKET_URL,Ticket.class,ticketno);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Ticket ticket = entity.getBody();
		return ticket;
	}

}
