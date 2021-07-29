package com.codingdojo.erd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.erd.services.ApiService;

@Controller
public class ERDController {
	private ApiService apiServ;			
		public ERDController(ApiService apiServ) {
			this.apiServ = apiServ;
		}
		
		@RequestMapping("/")
		public String index() {
			return "/index.jsp";
		}	
		
		
}