package com.learnByDoing.TodoApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnByDoing.TodoApp.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {

}
