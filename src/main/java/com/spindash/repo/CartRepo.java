package com.spindash.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spindash.entity.Cart;

public interface CartRepo extends CrudRepository<Cart, Integer> {
	Cart findById(int id);

	List<Cart> findByUserid(int userid);

	Cart findByGameid(int id);
}
