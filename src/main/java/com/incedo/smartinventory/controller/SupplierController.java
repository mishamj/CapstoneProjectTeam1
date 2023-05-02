
package com.incedo.smartinventory.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.smartinventory.entity.Supplier;

import com.incedo.smartinventory.service.SupplierService;


@RestController
@CrossOrigin(origins = "https://localhost:5432")

public class SupplierController {

  @Autowired
  private SupplierService supplierService;


  @PostMapping("/addSupplier")
  public Supplier addSupplier(@RequestBody Supplier supplier) {
     return supplierService.addSupplier(supplier);
}


   @PostMapping("/addSuppliers")
   public List<Supplier> addSuppliers(@RequestBody List<Supplier> suppliers) {
      return supplierService.addSuppliers(suppliers);
}
 
   @GetMapping("/suppliers")
   public List<Supplier> getAllSuppliers() {
      return supplierService.getAllSuppliers();
}


   @GetMapping("suppliers/{id}")
   public Supplier getSupplier(@PathVariable Long id) {
      return supplierService.getSupplier(id);
 }


  @DeleteMapping("/deleteSupp/{id}")
  public String deleteSupplier(@PathVariable Long id) {
     return supplierService.deleteCustomer(id);
      
}
}














