package com.Projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
