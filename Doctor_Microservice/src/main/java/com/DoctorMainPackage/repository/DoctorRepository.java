package com.DoctorMainPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DoctorMainPackage.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

}
