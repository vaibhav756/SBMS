package com.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {

	private Integer custid;
	private String custname;
	
}
