package com.spindash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spindash.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByEmail(String email);
	
}
