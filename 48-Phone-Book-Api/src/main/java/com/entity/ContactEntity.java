package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Contact")
public class ContactEntity {

	@Id
	@GeneratedValue()
	@Column(name="contact_id")
	private Integer contactId;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="contact_number")
	private Long contactNumber;
	
	@Column(name="contact_email")
	private String contactEmail;
	
}
