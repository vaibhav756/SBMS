package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
	
	@Query(value="select * from book",nativeQuery=true)  //This is SQL Query as we have mentioned nativeQuery=true
	public List<Book> getBooks(); 
	
	@Query("from Book")
	public List<Book> getAllBooks();
	
	@Modifying
	@Transactional
	@Query(value="update book set book_price=:price where book_id=:id",nativeQuery=true)
	public Integer updateBook(Double price,Integer id);
	
	@Modifying
	@Transactional
	@Query("update Book set bookPrice=:price where bookId=:id")
	public Integer updateBookByHql(Double price,Integer id);

	@Modifying
	@Transactional
	@Query(value="delete from book where book_id=:id",nativeQuery=true)
	public Integer deleteBookUsingSql(Integer id);
	
	@Modifying
	@Transactional
	@Query("delete from Book where bookId=:id")
	public Integer deleteBookUsingHql(Integer id);
	
	@Transactional
	@Modifying
	@Query(value="insert into book values(?,?,?)",nativeQuery=true)
	public Integer insertRecordUsingSql(Integer id,String name,Double price);

	//Insertion Doesn't work with HQL
	/*@Transactional
	@Modifying
	@Query("insert into Book values(?,?,?)")
	public Integer insertRecordUsingHql(Integer id,String name,Double price);*/
	
}
