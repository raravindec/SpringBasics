package com.raravindec.springdemo.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoContoller {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hi welocme";
	}
}
