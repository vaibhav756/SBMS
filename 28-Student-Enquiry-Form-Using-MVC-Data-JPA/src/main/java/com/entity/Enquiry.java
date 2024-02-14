package com.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="stud_enquiry")
public class Enquiry {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stud_enq_no")
	private Integer studEnqNo;
	
	@Column(name="stud_name")
	private String studName;
	
	@Column(name="stud_email")
	private String studEmail;
	
	@Column(name="stud_gender")
	private String studGender;
	
	@Column(name="course")
	private Integer course;
	
	@Column(name="timing")
	private Integer timing;
	
	@Column(name="stud_address")
	private String studAddress;
	
	@CreationTimestamp
	@Column(name="crtn_timestamp",updatable=false)
	private Timestamp crtnTimestamp;
	
	@UpdateTimestamp
	@Column(name="upd_timestamp",insertable=false)
	private Timestamp updateTimestamp;
	
}
