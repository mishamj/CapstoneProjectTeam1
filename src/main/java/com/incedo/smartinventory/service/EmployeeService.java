package com.incedo.smartinventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.smartinventory.entity.Employee;
import com.incedo.smartinventory.entity.Test;
import com.incedo.smartinventory.repository.EmployeeRepository;
import com.incedo.smartinventory.repository.TestRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private TestRepository testRepository;
	
	/* @Override */
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		
	}
	/*
	 * public Employee getEmployeeById(Long id) { return
	 * employeeRepository.findById(id).get(); }
	 */
	
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).get();
		
	}
	
	public Test getTestData(Long id) {
		return testRepository.findById(id).get();
	}
	
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
    }
	
	public List<Employee> addEmployees(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
		
	}
	
	public Employee updateEmployee(Employee employee) {
	    Employee existingProduct=employeeRepository.findById(employee.getEmpId()).orElse(null);
	    existingProduct.setFirstName(employee.getFirstName());
	    existingProduct.setLastName(employee.getLastName());
	    existingProduct.setPhoneNo(employee.getPhoneNo());
	    existingProduct.setAddress(employee.getAddress());
	    existingProduct.setEmailId(employee.getEmailId());
	    existingProduct.setPassword(employee.getPassword());
	    existingProduct.setUsername(employee.getUsername());
	    return employeeRepository.save(existingProduct);
	    
	    
	}
	
	public String deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		return "product removed !! "+id;
	 }



}
	
	
	
	
	
	
	


