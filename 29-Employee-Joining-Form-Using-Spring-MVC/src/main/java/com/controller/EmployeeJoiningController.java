package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dto.EmployeeJoiningDto;
import com.repo.EmployeeJoiningRepo;
import com.service.EmployeeJoiningService;

@Controller
public class EmployeeJoiningController {

	@Autowired
	private EmployeeJoiningRepo repo;
	
	@Autowired
	private EmployeeJoiningService service;	
	
	@GetMapping("/")
	public String home(Model model)
	{
		EmployeeJoiningDto dto=new EmployeeJoiningDto();
		//model.addAttribute("emp", repo.findById(12));
		//model.addAttribute("emp", dto);
		return "index";
	}
	
	@PostMapping("/submitempform")
	public String submitEmp(EmployeeJoiningDto dto,Model model)
	{
		service.saveEmployee(dto);
		System.out.println(dto);
		return "index";
	}
	
	@ModelAttribute
	public void getDetails(Model model)
	{
		model.addAttribute("department", service.getEmployeeDept());
		model.addAttribute("shift", service.getEmployeeShift());
		model.addAttribute("emp", new EmployeeJoiningDto());
	}
	
}
