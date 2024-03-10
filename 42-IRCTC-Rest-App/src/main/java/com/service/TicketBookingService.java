package com.service;

import com.dto.Passenger;
import com.dto.Ticket;

public interface TicketBookingService {

	Ticket bookTicket(Passenger pass);
	Ticket getTicket(Integer ticketno);
	
}
