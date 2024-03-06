package com;

import com.binding.Customer;
import com.google.gson.Gson;

public class GsonToJavaObject {

	public static void main(String[] args) {

		Customer cust=new Customer();
		cust.setId(101);
		cust.setName("Vaibhav Yadav");
		cust.setEmail("yvaibhav756@gmail.com");
		cust.setPhno(9090909090L);
		
		Gson gs=new Gson();
		String json = gs.toJson(cust);
		System.out.println(json);
		
		Customer customer = gs.fromJson(json, Customer.class);
		System.out.println(customer);
	}

}
