package com.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable{

	private Integer srno;
	private String name;
	private String countryCode;
	
}
