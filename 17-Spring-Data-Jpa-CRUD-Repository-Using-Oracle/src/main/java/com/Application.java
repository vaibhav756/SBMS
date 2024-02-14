package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.Book;
import com.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository bookRepo = context.getBean(BookRepository.class);
		Book b1=new Book();
		b1.setBookId(101);
		b1.setBookName("Core Java");
		b1.setBookPrice(3000.00);
		
		bookRepo.save(b1);
		
	}

}
