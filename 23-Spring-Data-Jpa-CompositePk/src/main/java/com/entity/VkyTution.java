package com.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="vky_tution")
public class VkyTution {

	@Column(name="student_name")
	private String studName;
	
	@EmbeddedId
	private TutionPk tutionPk;

	@Column(name="course_price")
	private Double coursePrice;
	
	
}
