package com.spindash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spindash.entity.User;
import com.spindash.repo.UserRepo;

@Service
public class UserServices {
	
	@Autowired
	UserRepo ur;

	public int add(User u) {
		ur.save(u);
		return 1;
	}

	public User find(String email) {
		User u=ur.findByEmail(email);
		return u;
	}
	
	
}
