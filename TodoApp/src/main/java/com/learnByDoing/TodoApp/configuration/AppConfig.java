package com.learnByDoing.TodoApp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnByDoing.TodoApp.helperLib.Validator;

@Configuration
public class AppConfig {
	@Bean
	public Validator getValidator() {
		return new Validator();
	}

}
