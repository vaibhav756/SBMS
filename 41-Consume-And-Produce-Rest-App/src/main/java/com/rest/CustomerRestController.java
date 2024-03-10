package com.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Customer;

@RestController
public class CustomerRestController {

	private Map<Integer,Customer> map=new HashMap<>();
	
	//Consumes data as xml
	//If we pass payload as json it will throw 415(unaccepted payload)
	//@PostMapping(value="addcustomer",consumes= {"application/json"},produces= {"application/xml"})
	@PostMapping(value="addcustomer",produces={"application/xml"})
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer cust)
	{
		map.put(cust.getCustid(),cust);
		return new ResponseEntity<>(cust,HttpStatus.CREATED);
	}
	
	//Produces XML and JSON
	//If we accept any other type than XML/JSON it will throw 406(Return type not supported)
	@GetMapping(value="getCustomer",produces= {"application/xml","application/json"})
	public ResponseEntity<Customer> getCostomer(@RequestParam("custid") Integer id)
	{
		Customer customer = map.get(id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
	}
	
	//Produces data as per client expectations
	@GetMapping("getCustByIdAndName")
	public ResponseEntity<Customer> getCust(@RequestParam("id") Integer id,@RequestParam("name") String name)
	{
		Customer customer = map.get(id);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
}
