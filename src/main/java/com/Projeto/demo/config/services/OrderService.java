package com.Projeto.demo.config.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Projeto.demo.entities.Order;
import com.Projeto.demo.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Integer id) {
	Optional<Order> obj = repository.findById(id);
	return obj.get();
	}

}
