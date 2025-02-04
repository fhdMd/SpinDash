package com.spindash.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spindash.entity.Wishlist;

public interface WishlistRepo extends CrudRepository<Wishlist, Integer> {
	Wishlist findById(int id);

	List<Wishlist> findByUserid(int userid);

	Wishlist findByGameid(int id);
}
