package com.test.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping( value ="/welcome", method=RequestMethod.GET)
	public String sayHi(){
		return "Welcome to SpringBoot Application !!!";
	}
	
	@RequestMapping( value ="/", method=RequestMethod.GET)
	public String sayHiToUser(){
		return "Hello Edge I Am 1.0 Version !!!!! ";
	}
	
	@RequestMapping( value ="/show", method=RequestMethod.GET)
	public String show(@RequestParam String name){
		return "Testing spring boot DevTools" ;
	}
	
}
