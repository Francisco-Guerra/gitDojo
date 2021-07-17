package com.codingdojo.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaHumano {
	    @RequestMapping("/")
	    public String index(@RequestParam(value = "name", required = false) String firstname) {
	    	if (firstname != null) {
	    		return "<h1>Hello "+firstname+"!</h1> <br><br><br> Welcome to SpringBoot!";
	    	}
	    	return "<h1>Hello Human!</h1> <br><br><br> Welcome to SpringBoot!";
	    }
}
