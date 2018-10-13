package com.stackroute.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.demo.model.Student;
import com.stackroute.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student savestudent(Student student){
		return studentRepository.save(student);
	}
	
	public List<Student> getallstudents(){
		return studentRepository.findAll();
	}

}
