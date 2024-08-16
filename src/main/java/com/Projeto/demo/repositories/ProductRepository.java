package com.Projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
