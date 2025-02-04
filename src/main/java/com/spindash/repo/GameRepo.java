package com.spindash.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spindash.entity.Game;
import com.spindash.entity.Wishlist;

public interface GameRepo extends CrudRepository<Game,Integer>{
	Game findById(int id);

	List<Game> findByPlatform(String platform);
}
