package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.TutionPk;
import com.entity.VkyTution;

public interface VkyTutionRepository extends JpaRepository<VkyTution,TutionPk>{

}
