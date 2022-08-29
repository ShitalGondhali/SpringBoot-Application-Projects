package com.springcrudoperationwithdb.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

@Autowired
private PersonRepository personRepository;

public List<Person> getPersonList()
{
	return personRepository.findAll();
}

public Person addPerson(Person p)
{
	return personRepository.save(p);
}
}
