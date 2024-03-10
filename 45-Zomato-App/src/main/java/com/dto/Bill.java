package com.dto;

import lombok.Data;

@Data
public class Bill {

	private String name;
	private Long mobno;
	private String email;
	private String food;
	private Integer quantity;
	private Integer orderid;
	private Integer price;
	private String orderstatus;

	
}
