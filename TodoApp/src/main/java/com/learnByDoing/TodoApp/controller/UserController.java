package com.learnByDoing.TodoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping(value = "/signup",method = RequestMethod.GET)
	public String login_route() {
		return "signup-template";
	}
	
	@RequestMapping(value="/signup",method = RequestMethod.POST)
	public ModelAndView signup(String fname, String lname, String mail) {
		System.out.println("Post mapping is triggered...");
		return new ModelAndView("forward:/");
	}
	

}
