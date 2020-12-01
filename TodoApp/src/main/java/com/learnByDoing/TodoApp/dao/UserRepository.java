package com.learnByDoing.TodoApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.learnByDoing.TodoApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
