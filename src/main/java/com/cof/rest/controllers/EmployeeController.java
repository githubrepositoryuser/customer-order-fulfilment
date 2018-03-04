package com.cof.rest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cof.model.Employee;
import com.cof.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employees")
	public  List<Employee> employees() {
		System.out.println("Inside  EmployeeController->employees");
		return employeeService.getAllEmployee();
	}

}
