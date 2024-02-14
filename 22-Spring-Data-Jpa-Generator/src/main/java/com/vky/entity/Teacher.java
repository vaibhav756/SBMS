package com.vky.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teacher_id")
	private Integer teacherId;
	
	@Column(name="teacher_name")
	private String teacherName;
	
	@Column(name="teacher_email")
	private String teacherEmail;
	
	@CreationTimestamp
	@Column(name="teacher_joining_date",updatable=false)
	private LocalDateTime teacherJoiningDate;
	
	@UpdateTimestamp
	@Column(name="teacher_update_date",insertable=false)
	private LocalDateTime teacherUpdateDate;	
	
	@Transient
	private String teacherFullName;
}
