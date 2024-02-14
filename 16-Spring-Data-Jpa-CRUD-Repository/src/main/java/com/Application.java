package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vky.entity.Book;
import com.vky.repository.BookRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		//System.out.println(book.getClass().getName());
		/*Book b=new Book();
		b.setBookId(101);
		b.setBookName("Core Java");
		b.setBookPrice(3000.00);
		
		//To insert record in table
		//Save method act as upsert method.Based on primary key first it will find is there any object with same id.If any record found then it will update that record else it will insert new record.
		repo.save(b);
		System.out.println("Data inserted successfully...");*/
		
		
		Book b1=new Book();
		b1.setBookId(102);
		b1.setBookName("Adv Java");
		b1.setBookPrice(5000.00);
		
		Book b2=new Book();
		b2.setBookId(103);
		b2.setBookName("Oracle");
		b2.setBookPrice(2000.00);
		
		Book b3=new Book();
		b3.setBookId(104);
		b3.setBookName("Hibernate");
		b3.setBookPrice(5000.00);

		//saveAll(Iterable) method is use to save collection of objects at a time in DB.
		repo.saveAll(Arrays.asList(b1,b2,b3));
		
		//existsById(ID); method is use to find if record is present or not with given id.
		//boolean record = repo.existsById(104);
		//System.out.println("Record Presense : "record);
		
		//count() method is use to find count of records available in database table.
		//long count = repo.count();
		//System.out.println(count+" no of records are present in table.");
		
		//To retrieve record in table
		//findById(primaryKeyDataType) method is use to retrieve record from table using id
		/*Optional<Book> bookObj = repo.findById(101);
		if(bookObj.isPresent())
		{
			System.out.println(bookObj.get());
		}*/

		//findAllById(Iterable) method is use to retrive no of records from database table using list of id's.
		/*Iterable<Book> listOfBook = repo.findAllById(Arrays.asList(102,103));
		listOfBook.forEach((book)->{
			System.out.println(book);
		});*/
		
		//findAll() method is use to retiever whole records from table without passing any parameter
		/*Iterable<Book> listUsingFindAll = repo.findAll();
		listUsingFindAll.forEach(book->{
			System.out.println(book);
		});*/
		
		//deleteById(ID) method is use to remove record from database table using primary key.
		//repo.deleteById(104);
		
		//deleteAllById(Iterable) method is use to remove records from database table using given list of primary keys.
		//repo.deleteAllById(Arrays.asList(102,103,104));
		
		Book b4=new Book();
		b4.setBookId(104);
		b4.setBookName("ABC");
		b4.setBookPrice(7000.00);
		
		Book b5=new Book();
		b5.setBookId(103);
		b5.setBookName("ABC");
		b5.setBookPrice(7000.00);
		
		/*
		//delete(Entity) method is use to remove object from database table using given object.It find first data using given primary key,If record present then it will remove that record else it won't do anything.
		repo.delete(b4);*/
		
		//repo.deleteAll(Arrays.asList(b4,b5));

		//deleteAll() method is use to remove all objects from database tables.
		//repo.deleteAll();
		
		/*List<Book> books = repo.findByBookPriceGreaterThanEqual(3000.00);
		books.forEach(book->System.out.println(book));*/
	}

}
