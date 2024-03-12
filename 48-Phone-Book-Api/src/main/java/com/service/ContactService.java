package com.service;

import java.util.List;

import com.dto.Contact;
import com.exception.ContactNotFoundException;

public interface ContactService {

	Integer savecontact(Contact cont);
	List<Contact> getAllContact();
	Contact getContactById(Integer id) throws ContactNotFoundException;
	void removeContact(Integer id);
}
