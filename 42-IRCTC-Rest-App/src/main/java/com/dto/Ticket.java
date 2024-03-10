package com.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Ticket {

	private String status;
	private Double cost;
	private String name;
	private String from;
	private String to;
	private String doj;
	private Integer trainno;
	private Integer ticketno;
	
}
