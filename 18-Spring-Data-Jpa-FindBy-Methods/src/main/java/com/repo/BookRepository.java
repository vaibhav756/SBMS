package com.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer>{

	public Book findByBookID(Integer id);
	public Book findByBookName(String name);
	public List<Book> findByBookPrice(Double price);
	public Book findByBookPriceAndBookName(Double price,String name);
	public List<Book> findByBookPriceOrBookName(Double price,String name);
	public List<Book> findByBookPriceGreaterThan(Double price);
	public List<Book> findByBookPriceGreaterThanEqual(Double price);
	public List<Book> findByBookPriceIn(List<Double> list);
	public List<Book> findByBookPriceIsLessThan(Double price);
	public List<Book> findByBookPriceIsLessThanEqual(Double price);
	public List<Book> findByBookPriceIsNotNull();
	public List<Book> findByBookPriceIsNull();	
	
}
