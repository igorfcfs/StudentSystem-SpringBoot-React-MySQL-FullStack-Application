package com.igorfcfs.springbootcrud.studentsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.igorfcfs.springbootcrud.studentsystem.model.Student;

@Service
public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getAllStudents();
}
