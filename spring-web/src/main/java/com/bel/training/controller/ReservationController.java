package com.bel.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bel.training.model.Reservation;

@Controller
public class ReservationController {
	@RequestMapping("/bookingForm")
	public String bookingForm(Model theModel) {
		Reservation res= new Reservation();
		theModel.addAttribute("reservation", res);
		return "resevationPage"; //it has reservation obj/attribute
	}
	
	@RequestMapping("/submitForm")  
	public String submitForm(@ModelAttribute("reservation") Reservation res)  
	{  
	    return "confirmation";  
	}  
}
