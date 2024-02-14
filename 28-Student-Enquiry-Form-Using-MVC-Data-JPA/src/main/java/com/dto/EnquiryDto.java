package com.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class EnquiryDto implements Serializable{

	private String name;
	private String email;
	private String gender;
	private Integer course;
	private List<String> timing;
	private String address;
}
