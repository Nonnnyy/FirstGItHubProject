package com.nonny.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to HOME Page";
	}
	
	@GetMapping("/dashboard")
public String dashboard() {
		return "Welcome to DASHBOARD Page";
	}
}
