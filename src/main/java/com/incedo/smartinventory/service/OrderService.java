package com.incedo.smartinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.smartinventory.entity.Order;
import com.incedo.smartinventory.repository.OrderRepository;

@Service

public class OrderService {
  @Autowired
   private OrderRepository orderRepository;
   public List<Order> getAllOrders() {
	   return orderRepository.findAll();
	   }
   public Order getOrder(Long id) {
	   return orderRepository.findById(id).get();
	   }
   public Order addOrder(Order order) {
		return orderRepository.save(order);
   }
	
	public List<Order> addOrders(List<Order> order) {
		return orderRepository.saveAll(order);
		}
	public String deleteOrder(Long id) {
		orderRepository.deleteById(id);
		return "order removed !! "+id;
	}
   
}

