package com.service;

import com.dto.Passenger;
import com.dto.Ticket;

public interface MakeMyTripService {

	Ticket bookTicket(Passenger pass);
	Ticket getTicket(Integer ticketno);
	
}
