package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Product;
import com.repo.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@PostMapping("/saveproduct")
	public String saveProd(@Validated Product prod,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "index";
		}
		Product save = repo.save(prod);
		model.addAttribute("product", new Product());
		model.addAttribute("msg", "Product with ProdId : "+String.valueOf(save.getProdId())+" has been saved.");
		return "index";
	}
	
	@GetMapping("/getallproducts")
	public String getProducts(Model model)
	{
		List<Product> products = repo.findAll();
		model.addAttribute("products", products);
		return "products";
	}
	
	@GetMapping("/editprod")
	public String editProduct(@RequestParam("prodId") Integer prodId,Model model)
	{
		Optional<Product> product = repo.findById(prodId);
		model.addAttribute("product", product.get());
		return "index";
	}
	
	@GetMapping("/removeprod")
	public String removeProduct(@RequestParam("prodId") Integer prodId,Model model)
	{
		repo.deleteById(prodId);
		List<Product> products = repo.findAll();
		model.addAttribute("products", products);
		model.addAttribute("msg", "Product Deleted.");
		return "products";
	}
	
}
