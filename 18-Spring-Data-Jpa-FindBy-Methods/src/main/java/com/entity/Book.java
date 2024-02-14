package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="book")
public class Book {

	@Id
	@Column(name="book_id")
	private Integer bookID;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="book_price")
	private Double bookPrice;
	
}
