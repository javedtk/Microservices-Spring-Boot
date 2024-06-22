package com.DoctorMainPackage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.DoctorMainPackage.entity.Doctor;
import com.DoctorMainPackage.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	DoctorService doctorservice;

	@RequestMapping(value="/saveDoctor",method=RequestMethod.POST)
	public Doctor saveDoctorlist(@RequestBody Doctor dot) {
		return doctorservice.saveDoctorlist(dot);
		
	}
	
	
	@GetMapping("/showDoctors/{d_id}")
	public Optional<Doctor> showDoctorById(@PathVariable int d_id){
		return doctorservice.showDoctorById(d_id);
	}
	
	
	@GetMapping("/doctorservice/{id}/{patient_id}")
	public String invokService(@PathVariable int id,@PathVariable int patient_id) {
		String response = template.exchange("http://PATIENT-SERVICE/showPaitent/{id}",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, id).getBody();
		
		String response1 = template.exchange("http://DIAGNOSIS-SERVICE/showList/{patient_id}",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, patient_id).getBody();
                
                
		return response+"\n"+response1+"\n"+doctorservice.showDoctorById(id);
		
		
	}
	
	
}
