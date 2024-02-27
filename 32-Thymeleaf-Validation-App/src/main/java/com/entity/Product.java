package com.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private Integer prodId;
	
	//@Email (Can be use to validate email pattern)
	@NotBlank(message="Name is mandatory")
	@Size(min=3,max=20,message="Name should be between 3 to 20 characters.")
	@Column(name="product_name")
	private String prodName;
	
	@NotNull(message="Price is mandatory")
	@Positive(message="Product price should be positive number.")
	@Column(name="product_price")
	private Double prodPrice;
	
	@NotNull(message="Quantity should not be null")
	@Positive(message="Product Quantity should be positive number.")
	@Column(name="product_quantity")
	private Integer prodQuant;
	
	@CreationTimestamp
	@Column(name="crtn_time",updatable=false)
	private Timestamp crtnTime;
	
	@UpdateTimestamp
	@Column(name="updt_time",insertable=false)
	private Timestamp updtTime;
	
}
