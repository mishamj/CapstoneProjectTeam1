package com.incedo.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

//import javax.persistence.Entity;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.smartinventory.entity.Customer;
import com.incedo.smartinventory.service.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
	   return customerService.addCustomer(customer);
	}

	@PostMapping("/addCustomers")
	public List<Customer>addCustomer(@RequestBody List<Customer> customers){
		return customerService.addCustomers(customers);
	}
	@GetMapping("/customers")
	public List<Customer>getAllCustomers(){
		return customerService.getAllCustomers();
	}
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable  Long id)
	{
		return customerService.getCustomer(id);
	}

	
	 @PutMapping("/updateCust")
	 public Customer updateCustomer(@RequestBody Customer customer) { 
		 return customerService.updateCustomer(customer); 
	  }
	@DeleteMapping("/deleteCust/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return customerService.deleteCustomer(id);
	}
	
	
	
	
	
}
