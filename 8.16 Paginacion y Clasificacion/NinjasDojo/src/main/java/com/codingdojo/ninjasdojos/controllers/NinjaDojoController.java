package com.codingdojo.ninjasdojos.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.ninjasdojos.models.Dojo;
import com.codingdojo.ninjasdojos.models.Ninja;
import com.codingdojo.ninjasdojos.services.NinjasDojosService;

@Controller
public class NinjaDojoController {
	private final NinjasDojosService ninjasDojosService;

	public NinjaDojoController(NinjasDojosService ninjasDojosService) {
		this.ninjasDojosService = ninjasDojosService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Dojo> dojos = ninjasDojosService.allDojos();
		model.addAttribute("dojos", dojos);
		return "jsp/index.jsp";
	}
	
	@GetMapping("dojos/new")
	public String dojoAdd(@ModelAttribute("dojo") Dojo dojo) {
		return "/jsp/addDojo.jsp";
	}
	
	@PostMapping("dojos/new")
	public String dojoAdd(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/jsp/addDojo.jsp";
		}else {
			ninjasDojosService.addDojo(dojo);
			return "redirect:/dojos/{dojoId}";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojo = ninjasDojosService.allDojos();
		model.addAttribute("dojos", allDojo);
		return "/jsp/addNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Model model, BindingResult result) {
		if(result.hasErrors()) {
			List<Dojo> allDojo = ninjasDojosService.allDojos();
			model.addAttribute("dojos", allDojo);
			return "/jsp/addNinja.jsp";
		}else {
			ninjasDojosService.addNinja(ninja);
			return "redirect:/dojos/"+ninja.getDojo().getId();
		}
	}
	
	@GetMapping("dojos/{dojoId}")
	public String showDojo(@PathVariable("dojoId") Long id, Model model) {
		Dojo dojo = ninjasDojosService.getDojo(id);
		List<Ninja> allNinjas = ninjasDojosService.allNinjas();
		ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
		for(Ninja ninja: allNinjas) {
			if(ninja.getDojo() == dojo) {
				ninjas.add(ninja);
			}
		}
		if(ninjas.size() == 0) {
			model.addAttribute("noone", "No ninjas here yet");
		}
		model.addAttribute("ninjas", ninjas);
		model.addAttribute("dojo", dojo);
		return "jsp/dogopage.jsp";
	}

}
