package com.stackroute.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.demo.model.Student;
import com.stackroute.demo.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public ResponseEntity<?> getAllStudents(){
		List<Student> studentlist = studentService.getallstudents();
		return new ResponseEntity<>(studentlist,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		
		Student student1 = studentService.savestudent(student);
		return new ResponseEntity<>(student1,HttpStatus.OK);
	}
}
