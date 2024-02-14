package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Book;
import com.repo.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("books",repo.findAll());
		return "index";
	}
	
	@GetMapping("/insertBook")
	public String insertNewBook(@RequestParam("book_name") String bookName,@RequestParam("book_price") Double bookPrice,Model model)
	{
		Book b1=new Book();
		b1.setBookName(bookName);
		b1.setBookPrice(bookPrice);
		Book book = repo.save(b1);
		model.addAttribute("bookid", book.getBookId());
		model.addAttribute("books", repo.findAll());
		return "displaybook";
	}
	
}
