package com.bel.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("myHome")
	public String showHome(ModelMap model) {
		model.addAttribute("user","username1");
		model.addAttribute("date", new java.util.Date());
		return "home";
	}
	
	@RequestMapping("/spring")
	public String showSecond(ModelMap model) {
		return "second";
	}
}
