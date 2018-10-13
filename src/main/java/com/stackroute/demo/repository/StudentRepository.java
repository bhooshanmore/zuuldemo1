package com.stackroute.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
