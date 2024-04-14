package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String contactNo;
	private String country;
	private String dob;
	
}
