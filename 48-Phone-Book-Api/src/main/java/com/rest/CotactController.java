package com.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Contact;
import com.exception.ContactNotFoundException;
import com.service.ContactService;

@RestController
public class CotactController {

	@Autowired
	private ContactService ser;
	
	@PostMapping("/addContact")
	public ResponseEntity<Integer> addContact(@RequestBody Contact cont)
	{
		Integer contId = ser.savecontact(cont);
		return new ResponseEntity<>(contId,HttpStatus.CREATED);
	}

	@GetMapping("/getAllContact")
	public ResponseEntity<List<Contact>> getAllContacts()
	{
		List<Contact> list = ser.getAllContact();
		return new ResponseEntity<>(list,HttpStatus.OK);	
		
	}
	
	@GetMapping("/getContactById")
	public ResponseEntity<Contact> getContactById(@RequestParam("contid") Integer id) throws ContactNotFoundException
	{
		Contact contact = ser.getContactById(id);
		return new ResponseEntity<>(contact,HttpStatus.OK);
	}
	
	@GetMapping("/deleteContact")
	public ResponseEntity<String> deleteContactById(@RequestParam("id") Integer id)
	{
		ser.removeContact(id);
		return new ResponseEntity<>("Contact has been deleted",HttpStatus.OK);
	}
	
}
