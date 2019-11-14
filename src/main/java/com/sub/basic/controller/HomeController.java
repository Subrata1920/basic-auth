package com.sub.basic.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value= {"/","/login"})
	@ExceptionHandler
	public String login() {
		return "Home";
	}
	
	@RequestMapping(value= {"/home"})
	@ExceptionHandler
	public String home() {
		return "Home";
	}
}
