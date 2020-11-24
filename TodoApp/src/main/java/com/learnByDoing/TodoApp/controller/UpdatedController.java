package com.learnByDoing.TodoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdatedController {
	@RequestMapping(value = "/testNow")
	String index () {return "Test succeded...";}
}
