package com.bel.training.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/signin")
	public String showSignUpForm()
	{
		return "signin";  //return view name
	}
	
	@RequestMapping("/bye")
	public String checkUser(HttpServletRequest req, Model m)
	{
		String uname=req.getParameter("name");
		String password=req.getParameter("pass");
		
		 if(password.equals("testing"))
		 {
			 String msg="Welcome "+uname;
			 m.addAttribute("message", msg);
			 return "Success";
		 }
		 else
		 {
			 String msg="Sorry "+uname+". You entered Incorrect Password.";
			 m.addAttribute("message", msg);
			 return "errorPage";
		 }
	




}
}
