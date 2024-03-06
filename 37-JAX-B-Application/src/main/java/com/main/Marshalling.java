package com.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.binding.Address;
import com.binding.Customer;

public class Marshalling {
	
	public static void main(String[] args) throws JAXBException {
		
		Customer c1=new Customer();
		c1.setId(102);
		c1.setName("Rohan Vele");
		c1.setEmail("rohan123@gmail.com");
		c1.setPhno(858558545L);
		
		Address add=new Address();
		add.setCity("Pune");
		add.setState("Maharashtra");
		add.setCountry("India");
		
		c1.setAddress(add);
		
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(c1, new File("Customer.xml"));
		
		
	}

}
