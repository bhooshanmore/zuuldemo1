package com.stackroute.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studentid;
	
	private String studentname;
	private String password;
	
	public Student() {
	}

	
	
	public long getStudentid() {
		return studentid;
	}



	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}



	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
