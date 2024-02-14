package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Timing;

@Repository
public interface TimingRepository extends JpaRepository<Timing,Integer>{
	
}
