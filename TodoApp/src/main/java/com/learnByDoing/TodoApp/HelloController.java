package com.learnByDoing.TodoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value = "/data")
	String index() {return "Hello world";}

}
