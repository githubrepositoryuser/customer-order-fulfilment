package com.cof.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cof.model.Employee;
import com.cof.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		 
		 return employeeRepository.getAllEmployee();
	 }
}
