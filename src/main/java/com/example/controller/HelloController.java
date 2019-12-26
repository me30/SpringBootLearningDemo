package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam("name") String name) {
		return "Hi " + name + ", Welcome to Spring boot application";
	}
	
}
