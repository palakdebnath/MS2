package com.example.MS2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ms2")
public class SampleController {

	@GetMapping("/hello") 
	public String sayHello() {
		return "Hello World!";
	}
}
