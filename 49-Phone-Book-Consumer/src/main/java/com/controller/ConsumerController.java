package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;

import com.dto.Contact;

@Controller
public class ConsumerController {

	private String ADD_CONTACT="http://localhost:8081/addContact";
	private String GET_ALL_CONTACT="http://localhost:8081/getAllContact";
	private String GET_CONTACT_BY_ID="http://localhost:8081/getContactById?contid={contid}";
	private String DELETE_CONTACT_BY_ID="http://localhost:8081/deleteContact?id={id}";
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("contact",new Contact());
		return "index";
	}
	
	@PostMapping("/addContact")
	public String addContact(Contact cont,Model model)
	{
		WebClient client=WebClient.create();
		Integer contactId = client.post()
		.uri(ADD_CONTACT)
		.bodyValue(cont)
		.retrieve()
		.bodyToMono(Integer.class)
		.block();
		
		model.addAttribute("msg","Contact has been added with contactId : "+contactId);
		model.addAttribute("contact",new Contact());
		return "index";
	}
	
	@GetMapping("/getAllContacts")
	public String getAllContacts(Model model)
	{
		WebClient client=WebClient.create();
		ArrayList<Contact> allCont = (ArrayList<Contact>)client.get()
		.uri(GET_ALL_CONTACT)
		.retrieve()
		.bodyToMono(ArrayList.class)
		.block();
		
		model.addAttribute("allcontacts", allCont);
		return "contacts";
	}
	
	@GetMapping("/editcontact")
	public String getContactById(@RequestParam("contId") Integer contId,Model model)
	{
		WebClient client=WebClient.create();
		Contact contact = client.get()
		.uri(GET_CONTACT_BY_ID,contId)
		.retrieve()
		.bodyToMono(Contact.class)
		.block();
		model.addAttribute("contact", contact);
		return "index";
	}
	
	@GetMapping("/removecontact")
	public String removeContactById(@RequestParam("contId") Integer id,Model model)
	{
		WebClient client=WebClient.create();
		String msg = client.get()
		.uri(DELETE_CONTACT_BY_ID,id)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		model.addAttribute("msg",msg);
		
		WebClient webclient=WebClient.create();
		ArrayList<Contact> allCont = (ArrayList<Contact>)webclient.get()
		.uri(GET_ALL_CONTACT)
		.retrieve()
		.bodyToMono(ArrayList.class)
		.block();
		
		model.addAttribute("allcontacts", allCont);
		
		
		return "contacts";
	}
}
