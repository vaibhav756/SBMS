package com;

import java.time.LocalTime;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.Book;
import com.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		System.out.println(LocalTime.now());
		List<Book> books = repo.getBooks();
		System.out.println(LocalTime.now());
		/*books.forEach(book->{
			System.out.println(book);
		});*/
		
		System.out.println(LocalTime.now());
		List<Book> allBooks = repo.getAllBooks();
		System.out.println(LocalTime.now());
		/*allBooks.forEach(book->{
			System.out.println(book);
		});*/
		
		//Custom update query using SQL
		/*Integer updateBook = repo.updateBook(7500.00,104);
		if(updateBook==1)
		System.out.println("Book Updated Successfully.");
		else
		System.out.println("Book updation failed.");*/

		//Custom update query using HQL
		/*Integer updateBookByHql = repo.updateBookByHql(4500.00, 104);
		if(updateBookByHql==1)
		System.out.println("Book Updated Successfully.");
		else
		System.out.println("Book updation failed.");
		
		Optional<Book> optBook = repo.findById(104);
		System.out.println(optBook.get());*/
		
		/*Book b1=new Book(105,"Linux",5000.00);
		Book b2=new Book(106,"Networking",7000.00);
		repo.saveAll(Arrays.asList(b1,b2));*/
		
		//Custom delete query using SQL
		/*Integer deleteBookUsingSql = repo.deleteBookUsingSql(106);
		if(deleteBookUsingSql==1)
		System.out.println("Book deleted successfully.");
		else
		System.out.println("Book deletion failed.");*/
		
		//Custom delete query using HQL
		/*Integer deleteBookUsingHql = repo.deleteBookUsingHql(105);
		if(deleteBookUsingHql==1)
		System.out.println("Book deleted successfully.");
		else
		System.out.println("Book deletion failed.");*/
		
		/*Integer insertRecord = repo.insertRecordUsingSql(105,"Linux",7000.00);
		if(insertRecord==1)
		System.out.println("Book Inserted Successfully.");
		else
		System.out.println("Book Insertion failed.");*/
		
		//Insertion Doesn't work with HQL
		/*Integer insertRecordUsingHql = repo.insertRecordUsingHql(106,"Networking",9000.00);
		if(insertRecordUsingHql==1)
		System.out.println("Book Inserted Successfully.");
		else
		System.out.println("Book Insertion failed.");*/
		
		
	}
}
