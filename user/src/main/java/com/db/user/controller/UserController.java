package com.db.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/home")
	public String myRoute() {
		return "Welcome To Spring Boot";
	}

}
