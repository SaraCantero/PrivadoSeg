package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {

	public abstract List <Patient> listAllPatient();
	public abstract Patient addPatient(Patient patient);
	public abstract int removePatient(int id);
	public abstract Patient updatePatient(Patient patient);
}
