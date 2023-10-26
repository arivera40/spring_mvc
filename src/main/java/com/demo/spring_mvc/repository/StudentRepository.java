package com.demo.spring_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring_mvc.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
