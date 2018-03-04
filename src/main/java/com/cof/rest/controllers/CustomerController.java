package com.cof.rest.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cof.model.Customer;
import com.cof.service.CustomerService;
import com.cof.service.CustomerServiceImpl;

@Controller
public class CustomerController {

	
	@RequestMapping(value="/login")
	public String login() {
		System.out.println("Inside  CustomerController->login");		
		return "login";
	}
	
	@RequestMapping(value="/handleLogin", method=RequestMethod.POST)
	public String handleLogin(HttpServletRequest request, HttpServletResponse res) {
		System.out.println("Inside  CustomerController->handleLogin");
		String uName = request.getParameter("name");
		String password = request.getParameter("password");
		CustomerService customerService = new CustomerServiceImpl();
		
		if(customerService.handleLogin(uName, password)) {
			return "home";
		}
		
		return "login";
	}
	
	
	@RequestMapping(value="/")
	public String home() {
		System.out.println("Inside  CustomerController->home");
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value="/test")
	public String test() {
		System.out.println("Inside  CustomerController->test");
		return "test";
	}
}
