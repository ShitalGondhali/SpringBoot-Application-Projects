package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresscontroller/threeparamters")
public class AddressController 
{
	
	@RequestMapping("/address/{city}/{state}/{country}")
	public String retAddress(@PathVariable("city") String city,@PathVariable("state") String state,@PathVariable("country") String country)
	{
	
		return "My Address is " +city+ "-"+ state+"-"+country;
	}
	

}
