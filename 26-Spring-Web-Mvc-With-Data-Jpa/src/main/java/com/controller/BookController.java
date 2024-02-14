package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Book;
import com.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@GetMapping("/insertbook")
	public ModelAndView insertBookRecord(@RequestParam("bookName") String bookName,@RequestParam("bookPrice") String bookPrice)
	{
		ModelAndView mv=new ModelAndView();
		
		Book b1=new Book();
		b1.setBookName(bookName);
		b1.setBookPrice(Double.valueOf(bookPrice));
		Book bookentry = repo.save(b1);
		mv.addObject("msg","Book has inserted with id : "+bookentry.getBookId());
		mv.setViewName("display");
		return mv;
	}
	
	@GetMapping("/getBookById")
	public ModelAndView getBookById(@RequestParam("bookId") Integer bookId)
	{
		ModelAndView mv=new ModelAndView("index");
		Optional<Book> book = repo.findById(bookId);
		if(book.isPresent())
		{
			mv.addObject("book",book.get());
		}
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
}
