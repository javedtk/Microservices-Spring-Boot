package com.kunal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunal.entity.Diagnosis;
//import com.kunal.entity.Patient;
import com.kunal.repository.DiagnosisRepository;


@Service
public class DiagnosisService {

	@Autowired
	DiagnosisRepository diagnosisrepo;
	
	
	public List<Diagnosis> showlist(){
		return diagnosisrepo.findAll();
	}
	
	public Diagnosis savelist(Diagnosis diagnosis) {
		return diagnosisrepo.save(diagnosis);
	}
	
	public Optional<Diagnosis> showPaitentsById(int id) {
	       System.out.println(id);
	    	return diagnosisrepo.findById(id);
	    }
}
