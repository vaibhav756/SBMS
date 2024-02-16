package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.EmployeeJoiningEntity;

@Repository
public interface EmployeeJoiningRepo extends JpaRepository<EmployeeJoiningEntity,Integer>{

}
