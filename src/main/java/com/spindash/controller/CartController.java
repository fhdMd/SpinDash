package com.spindash.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spindash.entity.Cart;
import com.spindash.entity.User;
import com.spindash.services.CartServices;

@Controller 
@SessionAttributes({"cartMap","user","cartList"})
public class CartController {
	
	@Autowired
	CartServices cs;
	
	@RequestMapping(value={"/cadd/{id}"},method = RequestMethod.GET)
	public String add(@PathVariable int id,Model model) {
		cs.add(new Cart(id, ((User)model.getAttribute("user")).getUserId()));
		Map<Integer,Boolean> cartMap=(Map<Integer,Boolean>)model.getAttribute("cartMap");
		cartMap.put(id, true);
		model.addAttribute("cartMap", cartMap);
		return "redirect:/game/"+id;
	}
	
	@RequestMapping(value={"/cremove/{id}"},method = RequestMethod.GET)
	public String remove(@PathVariable int id,Model model) {
		cs.remove(cs.findByGameid(id));
		Map<Integer,Boolean> cartMap=(Map<Integer,Boolean>)model.getAttribute("cartMap");
		cartMap.put(id, false);
		model.addAttribute("cartMap", cartMap);
		return "redirect:/game/"+id;
	}
	
	@RequestMapping(value="/cart",method = RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("cartList",cs.getAll(((User)model.getAttribute("user")).getUserId()));
		return "cart";
	}
}
