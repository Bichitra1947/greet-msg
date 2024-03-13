package com.java.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RsetController {
	
	@GetMapping("/greet")
	public String greeting() {
		
		return "Good morning";
	}

}
