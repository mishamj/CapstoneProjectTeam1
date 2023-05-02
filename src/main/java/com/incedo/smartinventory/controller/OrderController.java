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

import com.incedo.smartinventory.entity.Order;
import com.incedo.smartinventory.repository.CustomerRepository;
import com.incedo.smartinventory.repository.ProductRepository;
import com.incedo.smartinventory.service.OrderService;

@RestController
@CrossOrigin(origins = "https://localhost:5432")

public class OrderController {
	private CustomerRepository customerRepository;
	private ProductRepository productRepository;

	

	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order) {
	   return orderService.addOrder(order);
	}

	@PostMapping("/addOrders")
	public List<Order>addOrder(@RequestBody List<Order> orders){
		return orderService.addOrders(orders);
	}
	@GetMapping("/orders")
	public List<Order>getAllOrders(){
		return orderService.getAllOrders();
	}
	@GetMapping("/orders/{id}")
	public Order getOrder(@PathVariable  Long id)
	{
		return orderService.getOrder(id);
	}

	  
	@DeleteMapping("/deleteOrder/{id}")
	public String deleteOrder(@PathVariable Long id) {
		return orderService.deleteOrder(id);
	}
	
	
	
}
