package com.spindash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spindash.entity.Game;
import com.spindash.repo.GameRepo;

@Service
public class GameServices {
	@Autowired
	GameRepo gr;

	public List<Game> getAll() {
		// TODO Auto-generated method stub
		return (List<Game>) gr.findAll();
	}
	
	public Game get(int id) {
		// TODO Auto-generated method stub
		return gr.findById(id);
	}
	
	public int addGame(Game g) {
		gr.save(g);
		return 1;
	}

	public int remove(Game game) {
		gr.delete(game);
		return 1;
	}

	public List<Game> getByPlat(String platform) {
		// TODO Auto-generated method stub
		return (List<Game>)gr.findByPlatform(platform);
	}
}
