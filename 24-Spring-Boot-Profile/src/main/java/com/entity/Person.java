package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue()
	@Column(name="person_id")
	private Integer personId;
	
	@Column(name="person_name")
	private String personName;
	
	@Column(name="person_age")
	private Integer personAge;
	
}
