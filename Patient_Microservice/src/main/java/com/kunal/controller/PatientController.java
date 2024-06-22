package com.kunal.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kunal.entity.Patient;
import com.kunal.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	PatientService patientservice;

	
	@RequestMapping(value="/showPatients",method=RequestMethod.GET)
	public List<Patient> showPatient(){
		return patientservice.showPatient();
	}
	
	 
	@RequestMapping(value="/savePatient",method=RequestMethod.POST)
	public Patient savePatientlist(@RequestBody Patient patient) {
		return patientservice.savePatientlist(patient);
	}
	
	@GetMapping("/showPaitent/{id}")
	 public Optional<Patient> showPaitentById(@PathVariable int id){
		return patientservice.showPaitentById(id);
		 
	 }
	}

