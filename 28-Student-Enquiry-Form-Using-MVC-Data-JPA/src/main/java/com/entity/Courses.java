package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="courses")
public class Courses {

	@Id
	@Column(name="course_id")
	private Integer courseId;
	
	@Column(name="course_name")
	private String courseName;
	
}
