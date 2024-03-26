package com.rest;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Country;

@RestController
public class CountryRestController {

	HashOperations<String, Integer, Country> opsForHash=null;
	
	public CountryRestController(RedisTemplate<String,Country> rt)
	{
		opsForHash = rt.opsForHash();
	}
	
	@PostMapping("/addCountry")
	public String addCountry(@RequestBody Country country)
	{
		opsForHash.put("COUNTRIES", country.getSrno(), country);
		return "Country has been added with key : "+country.getSrno();
	}
	
	@GetMapping("/getCountry")
	public Country getCountry(@RequestParam("srno") Integer srno)
	{
		Country country = opsForHash.get("COUNTRIES", srno);
		return country;
	}

	@GetMapping("/removeCountry")
	public String deleteCountry(@RequestParam("srno") Integer srno)
	{
		Long result = opsForHash.delete("COUNTRIES", srno);
		if(result!=0)
		return "Country has been deleted...!!!";
		else
		return "Try after sometime...!!!";
		
	}
	
	@GetMapping("/getAllCountries")
	public List<Country> getAllCountries()
	{
		return opsForHash.values("COUNTRIES");
	}
	
}
