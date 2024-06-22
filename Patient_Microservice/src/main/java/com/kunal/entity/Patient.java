package com.kunal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@Column
	private String patientsname;
	@Column
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientsname() {
		return patientsname;
	}
	public void setPatientsname(String patientsname) {
		this.patientsname = patientsname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public Patient(int id, String patientsname, String email) {
//		super();
//		this.id = id;
//		this.patientsname = patientsname;
//		this.email = email;
//	}
}
