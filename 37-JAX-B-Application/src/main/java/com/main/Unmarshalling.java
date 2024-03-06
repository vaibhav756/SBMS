package com.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.binding.Customer;

public class Unmarshalling {

	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Customer cust = (Customer)unmarshaller.unmarshal(new File("Customer.xml"));
		
		
	}
	
}
