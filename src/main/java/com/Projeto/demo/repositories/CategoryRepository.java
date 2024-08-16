package com.Projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
