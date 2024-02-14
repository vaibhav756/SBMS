package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer>{	
	public List<Book> findByBookPriceGreaterThanEqual(Double price);
}

