package com.codingdojo.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Process {
	
	@RequestMapping(value = "/CodeProcess", method=RequestMethod.POST)
	public String codeProcess(@RequestParam(value="code")String code, RedirectAttributes redirectAttributes) {
		if (code.equals("bushido")) {
			return "redirect:/code";
		}
		else {
			String error = "<h2> You must train harder! </h2>";
			redirectAttributes.addFlashAttribute("error", error );
			
		}
		
		return "redirect:/";
	}

}
