package com.example.demo.model;

import javax.xml.crypto.Data;
import javax.persistence.Entity;

public class DoctorModels {
	
	private int id;
	private String name;
	private String last_name;
	private int age;
	private Data date;
	private String specialty;
	private String username;
	private String password;
	
	
	
	public DoctorModels() {
		super();
	}



	public DoctorModels(int id, String name, String last_name, int age, Data date, String specialty, String username,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.age = age;
		this.date = date;
		this.specialty = specialty;
		this.username = username;
		this.password = password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Data getDate() {
		return date;
	}



	public void setDate(Data date) {
		this.date = date;
	}



	public String getSpecialty() {
		return specialty;
	}



	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
