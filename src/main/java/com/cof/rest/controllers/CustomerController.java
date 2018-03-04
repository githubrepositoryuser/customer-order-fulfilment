package com.cof.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

	
	@RequestMapping(value="/login")
	public String login() {
		System.out.println("Inside  CustomerController->login");
		return "login";
	}
	
	@RequestMapping(value="/")
	public String home() {
		System.out.println("Inside  CustomerController->home");
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value="/test")
	public String test() {
		System.out.println("Inside  CustomerController->test");
		return "test";
	}
}
