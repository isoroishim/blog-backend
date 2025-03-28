package com.example.backend.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.business.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}