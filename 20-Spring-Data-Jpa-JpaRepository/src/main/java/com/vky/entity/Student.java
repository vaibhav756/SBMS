package com.vky.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {

	@Id
	@Column(name="student_id")
	private Integer studId;
	
	@Column(name="student_name")
	private String studName;
	
	@Column(name="student_email")
	private String studEmail;
	
	@CreationTimestamp
	@Column(name="student_registration_time",updatable=false)
	private LocalDateTime studRegTime;
	
	@UpdateTimestamp
	@Column(name="student_updatation_time",insertable=false)
	private LocalDateTime studUpdateTime;
}
