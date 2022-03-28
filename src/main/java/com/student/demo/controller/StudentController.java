package com.student.demo.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.student.demo.entity.StudentEntity;
import com.student.demo.service.IStudentService;

@RestController // this is a streotype annotation 
public class StudentController {
	
	@Autowired
	IStudentService studentService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String helloWorld() {
		return "Hello everyone welcome to the Spring Traning!";
	}

	@PostMapping("/student")
	Integer createStudent(@RequestBody StudentEntity student) {
		Integer id = studentService.saveStudent(student);
		System.out.println(id);
		return id;
	}
	@GetMapping("student/{id}")
	public Optional<StudentEntity> getStudent(@PathVariable Integer id) {
		Optional<StudentEntity> student = studentService.getStudent(id);
		return student;

	}
}
