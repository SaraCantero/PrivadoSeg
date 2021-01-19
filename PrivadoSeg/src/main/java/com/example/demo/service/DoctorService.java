package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;


public interface DoctorService {
	
	public abstract List <Doctor> listAllDoctor();
	public abstract Doctor addCourse(Doctor doctor);
	public abstract int removeDoctor(int id);
	public abstract Doctor updateDoctor(Doctor doctor);
	
	

}
