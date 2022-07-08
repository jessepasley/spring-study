package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/*
*@author : Arjun Metre
*/
@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/post")
	public String getLearnerDetails() {

		return "Hello From post";
	}

	@PutMapping("/update")
	public String putMethod() {
		return "";
	}

	@DeleteMapping("/delete")
	public String deleteMethod() {
		return "";
	}

}