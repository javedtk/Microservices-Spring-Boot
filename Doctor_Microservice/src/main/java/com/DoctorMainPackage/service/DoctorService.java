package com.DoctorMainPackage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoctorMainPackage.entity.Doctor;
import com.DoctorMainPackage.repository.DoctorRepository;


@Service
public class DoctorService {

	@Autowired
	DoctorRepository doctorrepo;
	
	public Doctor saveDoctorlist(Doctor dot) {
		return doctorrepo.save(dot);
	}


    public Optional<Doctor> showDoctorById(int id) {
       System.out.println(id);
    	return doctorrepo.findById(id);
    }
}
