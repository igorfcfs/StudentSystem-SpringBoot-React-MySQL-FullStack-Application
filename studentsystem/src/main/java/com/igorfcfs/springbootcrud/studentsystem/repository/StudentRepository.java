package com.igorfcfs.springbootcrud.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igorfcfs.springbootcrud.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
