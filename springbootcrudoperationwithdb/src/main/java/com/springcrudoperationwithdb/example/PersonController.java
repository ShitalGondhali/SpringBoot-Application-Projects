package com.springcrudoperationwithdb.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/persondetails")
	public List<Person> getPersonDetails()
	{
		return this.personService.getPersonList();
	}
	
	@PostMapping("/addperson")
	public Person addPersonDetails(@RequestBody Person p)
	{
		return this.personService.addPerson(p);
	}
	
}
