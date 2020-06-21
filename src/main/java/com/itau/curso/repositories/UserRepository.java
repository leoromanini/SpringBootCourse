package com.itau.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itau.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
