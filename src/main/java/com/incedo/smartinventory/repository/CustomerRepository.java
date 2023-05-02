package com.incedo.smartinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.smartinventory.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
	
