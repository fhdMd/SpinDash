package com.spindash.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spindash.entity.Cart;
import com.spindash.entity.Game;
import com.spindash.entity.Wishlist;
import com.spindash.repo.CartRepo;
import com.spindash.repo.GameRepo;

@Service
public class CartServices {
	
	@Autowired
	CartRepo cr;
	
	@Autowired
	GameRepo gr;
	
	public int add(Cart c) {
		cr.save(c);
		return 1;
	}
	
	public Cart findById(int id) {
		return cr.findById(id);
	}
	
	public int remove(Cart c) {
		cr.delete(c);
		return 1;
		
	}
	
	public List<Game> getAll(int id){
		List<Cart> cList=(List<Cart>) cr.findByUserid(id);
		List<Integer> iList=new ArrayList<Integer>();
		for(Cart c:cList) {
			iList.add(c.getGameid());
			}
		List<Game> cartList=new ArrayList<Game>();
		for(int i:iList) {
			cartList.add(gr.findById(i));
		}
		return cartList;
	}

	public Cart findByGameid(int id) {
		// TODO Auto-generated method stub
		return cr.findByGameid(id);
	}
}
