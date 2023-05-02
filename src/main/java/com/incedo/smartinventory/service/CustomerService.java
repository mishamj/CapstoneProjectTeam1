package com.incedo.smartinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.smartinventory.entity.Customer;
import com.incedo.smartinventory.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	/* @Override */
	
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	public Customer getCustomer(Long id) {
		return customerRepository.findById(id).get();
	}
	
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
    }
	
	public List<Customer> addCustomers(List<Customer> customer) {
		return customerRepository.saveAll(customer);
		
	}
	
	
	 public Customer updateCustomer(Customer customer) { Customer
	  existingCust=customerRepository.findById(customer.getCustid()).orElse(null);
	  existingCust.setFirstName(customer.getFirstName());
	  existingCust.setLastName(customer.getLastName());
	  existingCust.setPhoneNo(customer.getPhoneNo());
	  existingCust.setAddress(customer.getAddress());
	  existingCust.setEmailId(customer.getEmailId());
	 
	  return customerRepository.save(existingCust);
	  
	  }
	
	
	public String deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		return "Customer removed !! "+id;
	 }

}


