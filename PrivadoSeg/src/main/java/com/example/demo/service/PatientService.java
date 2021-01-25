package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.patient;
import com.example.demo.model.patientModel;

public interface PatientService {

	public abstract List <patient> listAllPatient();
	public abstract patient addPatient(patient patient);
	public abstract int removePatient(int id);
	public abstract patient updatePatient(patient patient);
}
