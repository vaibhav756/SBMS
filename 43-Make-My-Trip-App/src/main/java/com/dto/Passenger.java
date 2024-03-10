package com.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Passenger {

	private String name;
	private String from;
	private String to;
	private String doj;
	private Integer trainno;
	
}
