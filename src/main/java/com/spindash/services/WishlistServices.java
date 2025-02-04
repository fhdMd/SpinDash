package com.spindash.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spindash.entity.Game;
import com.spindash.entity.Wishlist;
import com.spindash.repo.GameRepo;
import com.spindash.repo.WishlistRepo;

@Service
public class WishlistServices {
	
	@Autowired
	WishlistRepo wr;
	
	@Autowired
	GameRepo gr;

	public int add(Wishlist w) {
		wr.save(w);
		return 1;
	}

	public Wishlist findById(int id) {
		// TODO Auto-generated method stub
		return wr.findById(id);
	}

	public int remove(Wishlist w) {
		wr.delete(w);
		return 1;
	}
	
	public List<Game> getAll(int userId) {
		List<Wishlist> wList=(List<Wishlist>) wr.findByUserid(userId);
		List<Integer> iList=new ArrayList<Integer>();
		for(Wishlist w:wList) {
			iList.add(w.getGameid());
			}
		List<Game> wishlist=new ArrayList<Game>();
		for(int i:iList) {
			wishlist.add(gr.findById(i));
		}
		return wishlist;
	}

	public Wishlist findByGameid(int id) {
		// TODO Auto-generated method stub
		return wr.findByGameid(id);
	}
	
	
}
