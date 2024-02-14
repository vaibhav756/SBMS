package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{

}
