package com.incedo.smartinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.smartinventory.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
	
