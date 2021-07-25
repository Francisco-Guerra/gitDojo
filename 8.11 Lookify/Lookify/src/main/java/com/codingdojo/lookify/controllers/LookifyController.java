package com.codingdojo.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.lookify.models.Lookify;
import com.codingdojo.lookify.services.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;
	 
	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
 
	@RequestMapping("/")
	public String start() {
		return "views/index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(@ModelAttribute("songName") Lookify song, Model model){
		List<Lookify> songs = lookifyService.allSongs();
		model.addAttribute("songs",songs);
		return "views/dashboard.jsp";
	}
	
	@PostMapping("songs/new")
	public String add(@Valid @ModelAttribute("Music") Lookify song, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return"views/add.jsp";
		}
		else {
			lookifyService.addSong(song);
			return"redirect:/dashboard";
		}
	}
		
	@GetMapping("songs/new")
	public String add(@ModelAttribute("Music") Lookify song) {
		return"views/add.jsp";
	}
	
	@DeleteMapping("dashboard/{songId}")
	public String destroy(@PathVariable("songId") Long id) {
		lookifyService.deleteSong(id);
		return"redirect:/dashboard";
	}
	
	@RequestMapping("songs/{songId}")
	public String info(@PathVariable("songId") Long id, Model model) {
		Lookify song = lookifyService.findSong(id);
		model.addAttribute("song",song);
		return "views/info.jsp";
	}
	
	@RequestMapping("search/topten")
		public String topTen(Model model) {
			List<Lookify> top = lookifyService.topTen();
			model.addAttribute("top",top);
			return "views/top.jsp";
			
	}
	
	@PostMapping ("/search")
	public String search(@ModelAttribute("songName") Lookify song) {
		return"redirect:/search/"+song.getName();
	}
	
	@RequestMapping("search/{search}")
	public String result(@ModelAttribute("songName") Lookify song, @PathVariable("search")String search, Model model) {
		List<Lookify> results = lookifyService.searchBy(search);
		model.addAttribute("search",search);
		model.addAttribute("results",results);
		return "views/search.jsp";
	}
	
}
