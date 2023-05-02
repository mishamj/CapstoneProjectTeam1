package com.incedo.smartinventory.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.smartinventory.entity.Product;
import com.incedo.smartinventory.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts() {
       return productRepository.findAll();
}

    public Product getProduct(Long id) {
       return productRepository.findById(id).get();
       }
    public Product addProduct(Product product) {
       return productRepository.save(product);
    }

   public List<Product> addProducts(List<Product> product) {
 return productRepository.saveAll(product);
 }
   
  public String deleteProduct(Long id) {
      productRepository.deleteById(id);;
      return "product removed !! " + id;
   }
}