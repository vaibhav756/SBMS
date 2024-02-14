package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="course_shift")
public class Timing {

	@Id
	@Column(name="shift_id")
	private Integer shiftId;
	
	@Column(name="shift_type")
	private String shiftType;
}
