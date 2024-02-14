package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue()
	@Column(name="book_id")
	private Integer bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="book_price")
	private Double bookPrice;
	
}
