package com.Projeto.demo.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projeto.demo.config.services.OrderService;
import com.Projeto.demo.entities.Order;


@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value ="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Integer id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}