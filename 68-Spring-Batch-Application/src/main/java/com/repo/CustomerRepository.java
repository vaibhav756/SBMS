package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
