package com;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		//Find Record using bookId
		System.out.println(repo.findByBookID(101));
		
		//Find Record using bookName
		System.out.println(repo.findByBookName("Adv Java"));
		
		//Find Record using bookPrice
		System.out.println(repo.findByBookPrice(2000.00));
		
		//Find Record using bookPrice and bookName
		System.out.println(repo.findByBookPriceAndBookName(2000.00, "Oracle"));
		
		//Find Record using bookPrice or bookName
		System.out.println(repo.findByBookPriceOrBookName(2000.00, "Adv Java"));
		
		//Find Record using greater than given bookPrice 
		System.out.println(repo.findByBookPriceGreaterThan(3000.00));
		
		//Find Record using greaterthanequals given bookPrice 
		System.out.println(repo.findByBookPriceGreaterThanEqual(3000.00));
		
		//Find records with given bookPrices
		System.out.println(repo.findByBookPriceIn(Arrays.asList(3000.00,5000.00)));
		
		//Find records less than given bookPrice
		System.out.println(repo.findByBookPriceIsLessThan(5000.00));
		
		//Find records less than equal to given bookPrice
		System.out.println(repo.findByBookPriceIsLessThan(3000.00));
		
		//Find records whose bookPrice is not null
		System.out.println(repo.findByBookPriceIsNotNull());
		
		//Find records whose bookPrice is null
		System.out.println(repo.findByBookPriceIsNull());
		
	}

}
