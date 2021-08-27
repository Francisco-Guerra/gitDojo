package com.codingdojo.shows.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.shows.models.Show;
import com.codingdojo.shows.models.User;
import com.codingdojo.shows.services.ShowService;
import com.codingdojo.shows.services.UserService;

public class ShowController {
	private UserService userService;
	private ShowService showService;
	
	public ShowController(UserService userService, ShowService showService) {
		super();
		this.userService = userService;
		this.showService = showService;
	}
	
	@RequestMapping("/shows")
	public String home(Principal principal, Model model, @Valid @ModelAttribute("show") Show show) {
		String email = principal.getName();
		User user = userService.findByEmail(email);
		model.addAttribute("user", user);
		List<Show> networks = new ArrayList<Show>();
		List<Show> avg = new ArrayList<Show>();
		model.addAttribute("networks", networks);
		model.addAttribute("avg", avg);
		return "show.jsp";
	}
	
	@PostMapping("/shows/new")
	public String newShow(@Valid @ModelAttribute("show") Show show, Principal principal, Model model, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/shows";
		}else {
			 String email = principal.getName();
			 User user = userService.findByEmail(email);
			 model.addAttribute("show", show);
			 model.addAttribute("user", user);
			 return "new.jsp";				 
		}
	}
	@RequestMapping("/shows/{id}")
	public String tvShow(@PathVariable("id") Long id, Principal principal, Model model, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/shows";
		}else {
		String email = principal.getName();
    	User user = userService.findByEmail(email);
    	Show show = (Show) showService.findShowsById(id);
    	model.addAttribute("user", user);
    	model.addAttribute("userf", user.getFirst_name());
    	model.addAttribute("userl", user.getLast_name());
    	model.addAttribute("show", show);
    	model.addAttribute("avg", show.getAvg());
    	return "view.jsp";
		}
	}
	
	@RequestMapping("/shows/{id}/edit")
	public String editShow(@PathVariable("id") Long id, Principal principal, Model model, @Valid @ModelAttribute("chng") Show chng, BindingResult result) {
		String email = principal.getName();
		User user = userService.findByEmail(email);
		model.addAttribute("user", user);
		model.addAttribute("show", showService.findShowsById(id));
		return "edit.jsp";
	}
	
	@RequestMapping("/shows/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		Show show = (Show) showService.findShowsById(id);
		for(User user: show.getUsers()) {
			List<Show> tvshow = user.getShows();
			tvshow.remove(show);
			user.setShows(tvshow);
			userService.saveUser(user);
		}
		showService.deleteShow(id);
		return "redirect:/shows";
	}
	
}
