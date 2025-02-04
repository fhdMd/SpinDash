package com.spindash.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spindash.entity.Game;
import com.spindash.entity.User;
import com.spindash.services.GameServices;
import com.spindash.services.UserServices;

@Controller
@SessionAttributes({"user","wishlistMap","cartMap"})
//@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserServices us;
	
	@Autowired
	GameServices gs;
	
	public Map<Integer,Boolean> init(GameServices gs,Map<Integer,Boolean> map) {
		List<Game> list=gs.getAll();
		for(Game g:list) {
			map.put(g.getGameId(), false);
		}
		return map;
	}

	@RequestMapping(value="index",method = RequestMethod.GET)
	public String checkItOut(Model model) {
		model.addAttribute("user",null);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/signup",method = RequestMethod.POST)
	public String addUser(@RequestParam String username, @RequestParam String email,@RequestParam String password, 
			@RequestParam String address,@RequestParam Long phonenumber, @RequestParam String cpassword, 
			Model model) 
	{
		if(cpassword.equals(password)) {
			User u=new User(username,email,password,address,phonenumber);
			us.add(u);
		        model.addAttribute("user", u);  // Set the user object in session
		        Map<Integer,Boolean> wishlistMap=init(gs,new HashMap<Integer,Boolean>());
				  Map<Integer,Boolean> cartMap=init(gs,new HashMap<Integer,Boolean>());
				  model.addAttribute("wishlistMap", wishlistMap);
				  model.addAttribute("cartMap", cartMap);
		        return "redirect:/home";
		}
		else {
			model.addAttribute("user", null);  // Set the user object in session
			return "redirect:/home";
		}
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String find(@RequestParam String email, @RequestParam String password,Model model) {
		User u=us.find(email);
		if(u.getPassword().equals(password)) {
			  model.addAttribute("user", u);
//		        System.out.println(session);
//		        System.out.println(session.getAttribute("user"));
//		        System.out.println(u);
			  Map<Integer,Boolean> wishlistMap=init(gs,new HashMap<Integer,Boolean>());
			  Map<Integer,Boolean> cartMap=init(gs,new HashMap<Integer,Boolean>());
			  model.addAttribute("wishlistMap", wishlistMap);
			  model.addAttribute("cartMap", cartMap);
			return "redirect:/home";
		}
		else {
			model.addAttribute("user", null);
			return "redirect:/home";
		}
	}
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logOut(Model model) {
		model.addAttribute("user","");
		return "redirect:/home";
	}
}
