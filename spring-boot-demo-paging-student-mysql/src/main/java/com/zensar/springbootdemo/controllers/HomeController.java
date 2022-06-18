package com.zensar.springbootdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//http://localhost:8080/
	@RequestMapping("/")
	//handling methods
	public String sayHello() {
		return "<h2> Welcome to Spring Boot</h2>";
	}
	
	@RequestMapping("/ghj")
	public String sayError() {
		return "<h2> Welcome </h2>";
	}
}
