package com.example.demo.repository;

import org.springframework.data.jpa.repository.Jparepository;

import com.example.demo.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Long>{

}