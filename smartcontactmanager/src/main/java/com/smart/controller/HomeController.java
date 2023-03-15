package com.smart.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.smart.entities.User;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "Register - Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";
	}
	
//	handler for registering user
	
	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,@RequestParam(value = "agreement",defaultValue = "false") boolean agreement, Model model) {
		return "signup";
	}

}
