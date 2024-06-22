package com.kunal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kunal.entity.Diagnosis;
import com.kunal.service.DiagnosisService;

@RestController
public class DaignosisController {
	@Autowired
	DiagnosisService diagnosisservice;

	
	@RequestMapping(value="/ShowList",method=RequestMethod.GET)
	public List<Diagnosis> showList(){
		return diagnosisservice.showlist();
	}
	
	 
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Diagnosis save(@RequestBody Diagnosis diagnosis) {
		return diagnosisservice.savelist(diagnosis);
	}
}
