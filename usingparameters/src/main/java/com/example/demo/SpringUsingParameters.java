package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/using/parameters")

public class SpringUsingParameters 
{
	@RequestMapping("/first")//Method Level mapping
		public String message() 
		{
			return "Welcome to Programming world";
		}
		
		@GetMapping("/second/{fname}/{lname}")
		public String second(@PathVariable("fname") String fname,@PathVariable("lname") String lname)
		{
			return "My Name is "+fname+" "+lname;
		}
		
	
		@GetMapping("/postman")
		public String getPostman()
		{
			return "Welcome to postman";
		}
		
		@PostMapping("/user")
		@ResponseBody
		public String postPostman(@RequestParam String str)
		{
			return "Welcome to Postman "+str;
		}
		
		@PostMapping("/reverse")
		public String reverseString(@RequestParam String message)
		{
			return new StringBuilder(message).reverse().toString();
		}
	
}
