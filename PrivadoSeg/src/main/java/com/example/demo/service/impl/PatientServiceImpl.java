package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.entity.patient;
import com.example.demo.model.patientModel;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientService;

public class PatientServiceImpl implements PatientService{

	@Autowired
	@Qualifier("patientRepository")
	private PatientRepository patientRepository;
	
	@Override
	public List<patient> listAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public patient addPatient(patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public int removePatient(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
		return 0;
	}

	@Override
	public patient updatePatient(patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

}
