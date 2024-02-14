package com.vky.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vky.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
}
