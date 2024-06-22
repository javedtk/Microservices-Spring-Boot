package com.DiagnosisPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DiagnosisPackage.entity.Diagnosis;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis,Integer>{

}
