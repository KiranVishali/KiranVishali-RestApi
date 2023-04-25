package com.example.springdemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterSpringDemo {
	
	@GetMapping("/login")
	public String Login()
	{
		return "Praji Login Sucessfully";
	}
	
	

}
