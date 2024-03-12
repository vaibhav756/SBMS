package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity,Integer>{

}
