package com.codingdojo.shows.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.shows.models.User;
import com.codingdojo.shows.services.UserService;
import com.codingdojo.shows.validator.UserValidator;

@Controller
public class UserController {
	//Variables
	private UserValidator userValidator;
	private UserService userService;
	
	//Constructor
	public UserController(UserService userService, UserValidator userValidator) {
	    this.userService = userService;
	    this.userValidator = userValidator;
    }
	
	//Methods	
	@RequestMapping(value={"/", "/home", "/index"})
	public String index() {
		return "loginregister.jsp";
    }
	
	@RequestMapping(value={"/login","/registration"})
	public String login(Model model,@RequestParam(value="error",required=false) String error,@RequestParam(value="logout",required=false) String logout){
		if(error != null){
			model.addAttribute("errorMessage","Invalid Credentials.");
			}
		if(logout != null){
			model.addAttribute("logoutMessage","Logout Successful");
			}		
		model.addAttribute("user",new User());
		return "loginregister.jsp";
	}
	
	@PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        userValidator.validate(user, result);        
        if(result.hasErrors()) {
            return "loginregister.jsp";
        } else {
        	userService.saveUser(user);
        	return "homepage.jsp";
        }
    }
}