package com.bel.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bel.training.model.Employee;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String hello() 
	{
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/spring1")
	public String hello1() 
	{
		return "Hello Spring1 ";
	}
	@RequestMapping("/employees")
	public List<Employee> getEmployee()
	{	
		Employee e1=new Employee(101,"Rod","Jhonson","rodj@spring.com");
		Employee e2=new Employee(102,"James","Gosling","james@sun.com");
		Employee e3=new Employee(103,"Raj","gs","raj@rps.com");
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		return empList;
		
	}
	
}
