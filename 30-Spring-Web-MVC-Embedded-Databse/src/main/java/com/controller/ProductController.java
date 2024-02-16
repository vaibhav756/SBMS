package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dto.ProductDto;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("dto",new ProductDto());
		return "index";
	}
	
	@PostMapping("/addproduct")
	public String addProducts(ProductDto dto,Model model)
	{
		boolean saveProduct = service.saveProduct(dto);
		model.addAttribute("products", service.getProduct());
		return "products";
	}
	
	
	
}
