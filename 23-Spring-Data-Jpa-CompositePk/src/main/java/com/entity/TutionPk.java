package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class TutionPk implements Serializable{

	@Column(name="student_pan")
	private String studPan;
	
	@Column(name="course_name")
	private String courseName;
	
}
