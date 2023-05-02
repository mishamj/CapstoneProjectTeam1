package com.incedo.smartinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.smartinventory.repository.SupplierRepository;
import com.incedo.smartinventory.entity.Supplier;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	
	/* @Override */
	
	public List<Supplier> getAllSuppliers() {
		return supplierRepository.findAll();
	}
	public Supplier getSupplier(Long id) {
		return supplierRepository.findById(id).get();
	}
	
	public Supplier addSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
    }
	
	public List<Supplier> addSuppliers(List<Supplier> supplier) {
		return supplierRepository.saveAll(supplier);
		
	}
	
	
	public String deleteCustomer(Long id) {
		supplierRepository.deleteById(id);
		return "supplier removed !! "+id;
	 }

}


