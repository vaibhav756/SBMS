package com.vky.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@Column(name="employee_id")
	private Integer empId;
	
	@Column(name="employee_name")
	private String empName;
	
	@Column(name="employee_salary")
	private Double empSalary;
	
	@Column(name="employee_gender")
	private String empGender;
	
	@Column(name="employee_department")
	private String empDept;
	
	@CreationTimestamp
	@Column(name="crtn_time",updatable=false)
	private LocalDateTime crtnTime;
	
	@UpdateTimestamp
	@Column(name="updt_time",insertable=false)
	private LocalDateTime updtTime;
	
	
}
