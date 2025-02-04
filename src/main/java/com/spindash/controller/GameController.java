package com.spindash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spindash.entity.Game;
import com.spindash.services.GameServices;

@Controller
@SessionAttributes({"game", "gameList", "platGameList","platform"})
public class GameController {
	@Autowired
	GameServices gs;
	
	@RequestMapping(value={"/home"},method = RequestMethod.GET)
	public String getAll(Model model) {
			model.addAttribute("gameList", gs.getAll());
		return "home";
	}
	
	@RequestMapping(value={"/game/{id}"},method = RequestMethod.GET)
	public String get(@PathVariable("id")  int id,Model model) {
		model.addAttribute("game", gs.get(id));
		return "entry"; 
	}
	
	@RequestMapping(value={"/platform/{platform}"},method = RequestMethod.GET)
	public String filter(@PathVariable("platform")  String platform,Model model) {
		model.addAttribute("platGameList", gs.getByPlat(platform));
		model.addAttribute("platform", platform);
		return "platform";
//		return (List<Game>)gs.getByPlat(platform);
	}
	
	@PutMapping("/admin/game")
	public int add(@RequestBody Game g) {
		return gs.addGame(g);
	}
	
	@DeleteMapping("/admin/{id}")
	public int delete(int id) {
		return gs.remove((gs.get(id)));
	}
}
