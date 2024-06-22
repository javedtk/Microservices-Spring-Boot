package com.kunal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunal.entity.Patient;
import com.kunal.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientrepo;
	
	public List<Patient> showPatient(){
		return patientrepo.findAll();
	}
	
	public Patient savePatientlist(Patient patient) {
		return patientrepo.save(patient);
	}


    public Optional<Patient> showPaitentById(int id) {
       System.out.println(id);
    	return patientrepo.findById(id);
    }
}
