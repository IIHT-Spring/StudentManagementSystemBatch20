package com.student.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // this is a streotype annotation 
public class StudentController {
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String helloWorld() {
		return "Hello everyone welcome to the Spring Traning!";
	}

}
