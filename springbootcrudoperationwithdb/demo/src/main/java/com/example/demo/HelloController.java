package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	@GetMapping("/hello1")//Method Level mapping
	public String hello1() {
		return "Welcome to Programming world";
	}
}
