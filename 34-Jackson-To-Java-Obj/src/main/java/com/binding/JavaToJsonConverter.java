package com.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws IOException {
		
		Customer c1=new Customer();
		c1.setId(101);
		c1.setName("Vaibhav Yadav");
		c1.setEmail("yvaibhav756@gmail.com");
		c1.setPhno(9090909090L);
		
		Address address=new Address();
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		c1.setAddress(address);
		ObjectMapper om=new ObjectMapper();
		try {
			//Java Object to JSON Converter
			om.writeValue(new File("custjson.json"), c1);
			
			//JSON Object to Java Object convertion
			Customer custVal = om.readValue(new File("custjson.json"), Customer.class);
			System.out.println(custVal);

			//Java Object to JSON String convertion
			/*String custJson = om.writeValueAsString(c1);
			//System.out.println(custJson);
			//System.out.println();
			Customer custObj = om.readValue(custJson, Customer.class);
			System.out.println(custObj);*/
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
