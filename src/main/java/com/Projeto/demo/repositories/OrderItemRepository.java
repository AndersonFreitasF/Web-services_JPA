package com.Projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.demo.config.services.OrderItem;
import com.Projeto.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
