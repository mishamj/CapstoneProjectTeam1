package com.incedo.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.smartinventory.entity.Employee;
import com.incedo.smartinventory.entity.Test;
import com.incedo.smartinventory.service.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("I am in addemployee method");
		return employeeService.addEmployee(employee);
    }
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody  List<Employee> employees) {
		return employeeService.addEmployees(employees);
	    }
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
	return employeeService.getAllEmployees();
	 }
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Long id) {
	return employeeService.getEmployee(id);
	 }
	
	@GetMapping("test/{id}")
	public Test getTestData(@PathVariable Long id) {
	return employeeService.getTestData(id);
	 }
	
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee employee) {
	 return employeeService.updateEmployee(employee);
	 }
	
	
	
	@DeleteMapping("/deleteemp/{id}")
	public String deleteEmployee(@PathVariable int id) {
	return employeeService.deleteEmployee(id);
	}


}
