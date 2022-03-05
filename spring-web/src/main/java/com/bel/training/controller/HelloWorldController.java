package com.bel.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/Hello")
	public String showHello() {
		System.out.println("inside myhome controller");
		return "Hello";
	}

}
