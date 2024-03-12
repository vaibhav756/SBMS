package com.dto;

import lombok.Data;

@Data
public class Order {

	private String name;
	private Long mobno;
	private String email;
	private String food;
	private Integer quantity;
	
}