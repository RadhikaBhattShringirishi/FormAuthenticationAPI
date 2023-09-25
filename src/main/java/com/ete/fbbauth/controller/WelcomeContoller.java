package com.ete.fbbauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeContoller {
	
	@GetMapping("/")
	public String greetingSecurity() {
		return "welcome";
		
	}

}
