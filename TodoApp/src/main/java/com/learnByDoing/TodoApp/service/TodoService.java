package com.learnByDoing.TodoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnByDoing.TodoApp.dao.TodoRepository;
import com.learnByDoing.TodoApp.model.Todo;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
	@Autowired
	TodoRepository todoRepo;
	
	public void insertData(Todo todo) {
		todoRepo.save(todo);
	}
	public List<Todo> getList() {
		List<Todo> resList = new ArrayList<Todo>();
		resList = todoRepo.findAll();
		return resList;
	}
	
	public void deleteAll( ) {todoRepo.deleteAll();}
	
	public List<Todo> getAll() {return todoRepo.findAll();}
	
	public void delete(long id) {
		List<Todo> todo_list = new ArrayList<Todo>();
		todo_list = todoRepo.findAll();
		Todo res_val = new Todo();
		
		for (int i = 0; i < todo_list.size();i++) {
			if (todo_list.get(i).getId() == id) {
				res_val = todo_list.get(i);
			}
		}

		todoRepo.delete(res_val);
		
		
	}
}
