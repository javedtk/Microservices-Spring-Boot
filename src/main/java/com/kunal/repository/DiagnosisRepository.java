package com.kunal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kunal.entity.Diagnosis;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis,Integer>{

}
