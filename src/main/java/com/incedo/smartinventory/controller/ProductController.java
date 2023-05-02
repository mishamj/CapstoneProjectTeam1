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

import com.incedo.smartinventory.entity.Product;
import com.incedo.smartinventory.service.ProductService;
@RestController
@CrossOrigin(origins = "*")

public class ProductController {
	
	 @Autowired
	   private ProductService productService;
	 
	 @PostMapping("/addProduct")
	   public Product addProduct(@RequestBody Product product) {
	      return productService.addProduct(product);
	   }
	 
	 @PostMapping("/addProducts")
	   public List<Product> addProducts(@RequestBody List<Product> products) {
	      return productService.addProducts(products);
	   }
	 
	 @GetMapping("/products")
	   public List<Product> getAllProducts() {
	      return productService.getAllProducts();
	   }
	 
	 @GetMapping("/products/{id}")
	   public Product getProduct(@PathVariable  Long id){
		   return productService.getProduct(id);
		}
	 

	   @DeleteMapping("/deleteProd/{id}")
	   public String deleteProduct(@PathVariable Long id) {
		   return productService.deleteProduct(id);
	   }
	
	
}
