package com.vky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vky.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

}
