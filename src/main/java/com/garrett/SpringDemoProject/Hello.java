package com.garrett.SpringDemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping(path = "/")
	public String greet() {
		return "Spring Boot Test Demo.";
	}

}
