package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Contact;
import com.entity.ContactEntity;
import com.exception.ContactNotFoundException;
import com.repo.ContactRepository;
import com.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository repo;
	
	@Override
	public Integer savecontact(Contact cont) {
		ContactEntity contentity=new ContactEntity();
		BeanUtils.copyProperties(cont, contentity);
		ContactEntity ent = repo.save(contentity);
		return ent.getContactId();
	}

	@Override
	public List<Contact> getAllContact() {
		List<ContactEntity> ent=repo.findAll();
		List<Contact> list = ent.stream().map(ents->setContact(ents)).collect(Collectors.toList());
		return list;
	}

	@Override
	public Contact getContactById(Integer id) throws ContactNotFoundException {
		Optional<ContactEntity> cont = repo.findById(id);
		ContactEntity contactEntity=null;
		Contact contact=new Contact();
		if(cont.isPresent())
		{
			contactEntity = cont.get();
			BeanUtils.copyProperties(contactEntity, contact);
		}
		else
		{
			throw new ContactNotFoundException("Contact is unavailable.");
		}
		return contact;
	}

	@Override
	public void removeContact(Integer id) {
		repo.deleteById(id);
	}

	public static Contact setContact(ContactEntity ent)
	{
		Contact cont=new Contact();
		BeanUtils.copyProperties(ent, cont);
		return cont;
	}
	
}
