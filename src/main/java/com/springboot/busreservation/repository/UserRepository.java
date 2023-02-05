package com.springboot.busreservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.busreservation.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	List<User> findAll();
	
}
