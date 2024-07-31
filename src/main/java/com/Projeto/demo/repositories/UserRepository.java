package com.Projeto.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projeto.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
