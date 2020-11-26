package com.learnByDoing.TodoApp.helperLib;

import org.springframework.beans.factory.annotation.Autowired;

import com.learnByDoing.TodoApp.model.Todo;
import com.learnByDoing.TodoApp.service.TodoService;
import java.util.List;
import java.util.ArrayList;

public class Validator {
	@Autowired
	TodoService todoService;
	
	public boolean validateUsername(String name) {
		//Todo todo_obj = new Todo();
		List<Todo> todo_list = new ArrayList<Todo>();
		todo_list = todoService.getAll();
		for (int i = 0; i < todo_list.size(); i++) {
			System.out.println("Printing from validator class : "+todo_list.get(i).getName());
			if (name.toUpperCase().compareTo(todo_list.get(i).getName().toUpperCase()) == 0) {
				System.out.println("It's working username : "+todo_list.get(i).getName());
				return true;
			}
		}
		//
		return false;
	}
}
