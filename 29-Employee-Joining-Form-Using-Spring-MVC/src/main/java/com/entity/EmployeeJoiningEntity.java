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
@Table(name="employee_joining")
public class EmployeeJoiningEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_email")
	private String empEmail;
	
	@Column(name="emp_gender")
	private String empGender;
	
	@Column(name="emp_dept")
	private String empDept;
	
	@Column(name="emp_shift")
	private String empShift;
	
	@Column(name="emp_address")
	private String empAddress;
	
	@CreationTimestamp()
	@Column(name="crtn_timestamp",updatable=false)
	private Timestamp crtnTimestamp;
	
	@UpdateTimestamp()
	@Column(name="upd_timestamp",insertable=false)
	private Timestamp updTimestamp;
	
}
