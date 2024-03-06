package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.binding.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class CustomerController {

	@PostMapping("/getCustomer")
	public Customer getcust(@RequestParam("id") Integer id) throws JsonProcessingException
	{
		Customer c1=new Customer(101,"Vaibhav Yadav","afsdas",9955656L);
		Customer c2=new Customer(102,"Kiran Yadav","srerre",989898L);
		Customer c3=new Customer(103,"Amit Devkar","kljlj",565656L);
		
		List<Customer> list = Arrays.asList(c1,c2,c3);
		Optional<Customer> findFirst = list.stream().filter(cust->cust.getId()==id).findFirst();
		//ObjectMapper om=new ObjectMapper();
		//String custDetails = om.writeValueAsString(findFirst.get());
		return findFirst.get();
	}
	
}
