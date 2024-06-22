package com.DoctorMainPackage.entity;

import jakarta.persistence.*;


//import javax.persistence.Entity;
//import javax.persistence.*;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int d_id;
	@Column
	private String d_name;
	public int getId() {
		return d_id;
	}
	public void setId(int id) {
		this.d_id = id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
}


