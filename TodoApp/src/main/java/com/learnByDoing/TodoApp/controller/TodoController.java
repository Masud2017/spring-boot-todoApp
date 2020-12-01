package com.learnByDoing.TodoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learnByDoing.TodoApp.helperLib.Validator;
import com.learnByDoing.TodoApp.model.Todo;
import com.learnByDoing.TodoApp.service.TodoService;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;


@Controller
class TodoController {
	@Autowired
	TodoService todoService;
	@Autowired 
	Validator validator;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("project","This is a project");
		List<Todo> todo_list = new ArrayList<Todo>();
		todo_list = todoService.getAll();
		
		for (int i = 0; i < todo_list.size(); i++) {
			System.out.println("Name "+todo_list.get(i).getName()+" Date "+todo_list.get(i).getDate()+" Author: "+todo_list.get(i).getAuthor());
			
		}
		model.addAttribute("items",todoService.getAll());
		
		return "home-template";
	}
	
	@RequestMapping(value="/add")
	ModelAndView add(@ModelAttribute Todo todo,String name,String date, String author,String desc) {
		Todo new_todo = new Todo();
		System.out.println(desc);
		if (validator.validateUsername(name) == false) {
			
			new_todo.setName( name);
			new_todo.setDate (date);
			new_todo.setAuthor(author);
			new_todo.setDesc(desc);
			
			todoService.insertData(new_todo);
		} else {
			return new ModelAndView("forward:/");
		}
		
		return new ModelAndView("forward:/");
	}
	
	@RequestMapping(value="/clear")
	public ModelAndView deleteAll() {
		todoService.deleteAll();
		return new ModelAndView("forward:/");
	}
	@RequestMapping(value="/delete/{id}")
	public ModelAndView deleteSelected(@PathVariable Long id) {
		
		todoService.delete(id);
	
		
		
		return new ModelAndView("forward:/");
	}
}