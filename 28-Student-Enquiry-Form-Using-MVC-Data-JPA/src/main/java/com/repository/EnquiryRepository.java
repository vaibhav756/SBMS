package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry,Integer>{

}
