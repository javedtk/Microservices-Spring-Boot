package com.kunal.entity;

import javax.persistence.*;

@Entity
public class Diagnosis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_id;
	@Column
	private String disease_name;
	@Column
	private String consultation;
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getDisease_name() {
		return disease_name;
	}
	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}
	public String getConsultation() {
		return consultation;
	}
	public void setConsultation(String consultation) {
		this.consultation = consultation;
	}
	public Diagnosis(int patient_id, String disease_name, String consultation) {
		super();
		this.patient_id = patient_id;
		this.disease_name = disease_name;
		this.consultation = consultation;
	}
}
