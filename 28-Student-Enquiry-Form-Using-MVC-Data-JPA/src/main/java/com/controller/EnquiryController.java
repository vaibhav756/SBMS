package com.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.Courses;
import com.entity.Enquiry;
import com.entity.Timing;
import com.repository.CoursesRepository;
import com.repository.EnquiryRepository;
import com.repository.TimingRepository;

@Controller
public class EnquiryController {

	@Autowired
	private CoursesRepository courserepo;
	
	@Autowired
	private TimingRepository timerepo;
	
	@Autowired
	private EnquiryRepository enqrepo;
	
	@GetMapping("/")
	public String home(Model model)
	{
		Enquiry dto=new Enquiry();
		/*dto.setName("Vaibhav Yadav");
		dto.setEmail("yvaibhav756@gmail.com");
		dto.setGender("Male");
		dto.setCourse(4);
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		//dto.setTiming(list);
		dto.setAddress("Mumbai");
		*/
		//GetModelData(model);
		return "index";
	}
	
	@PostMapping("/submitenqform")
	public String submitForm(Enquiry dto,Model model)
	{
		System.out.println(dto);
		enqrepo.save(dto);
		
		//GetModelData(model);
		model.addAttribute("msg","Form Data Saved...");
		return "index";
	}

	@ModelAttribute
	private void GetModelData(Model model) {
		List<Courses> courses = courserepo.findAll();
		List<Integer> course=courses.stream().map(coursez->coursez.getCourseId()).collect(Collectors.toList());
		List<Timing> times = timerepo.findAll();
		List<String> time = times.stream().map(timez->timez.getShiftType()).collect(Collectors.toList());
		model.addAttribute("enquiry", new Enquiry());
		model.addAttribute("courses", course);
		model.addAttribute("time", time);
	}
}
