package com.spindash.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spindash.entity.User;
import com.spindash.entity.Wishlist;
import com.spindash.services.WishlistServices;

@Controller
@SessionAttributes({"wishlist","user","wishlistMap"})
public class WishlistController {
	
	@Autowired
	WishlistServices ws;
	 
	@RequestMapping(value={"/wadd/{id}"},method = RequestMethod.GET)
	public String add(@PathVariable int id,Model model) {
		ws.add(new Wishlist(id, ((User)model.getAttribute("user")).getUserId()));
		Map<Integer,Boolean> wishlistMap=(Map<Integer,Boolean>)model.getAttribute("wishlistMap");
		wishlistMap.put(id, true);
		model.addAttribute("wishlistMap", wishlistMap);
		return "redirect:/game/"+id;
	}
	
	@RequestMapping(value={"/wremove/{id}"},method = RequestMethod.GET)
	public String remove(@PathVariable int id,Model model) {
		ws.remove(ws.findByGameid(id));
		Map<Integer,Boolean> wishlistMap=(Map<Integer,Boolean>)model.getAttribute("wishlistMap");
		wishlistMap.put(id, false);
		model.addAttribute("wishlistMap", wishlistMap);
		return "redirect:/game/"+id;
	}
	
	@RequestMapping(value="/wishlist",method = RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("wishlist",ws.getAll(((User)model.getAttribute("user")).getUserId()));
		return "wishlist";
	}
}
