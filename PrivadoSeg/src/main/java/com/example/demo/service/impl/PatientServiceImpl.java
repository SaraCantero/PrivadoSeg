package com.example.demo.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PatientEntity;
import com.example.demo.interfaces.InPatient;
import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private InPatient ip;
	
	@Override
	public List<Patient> listAllPatient() {
		// TODO Auto-generated method stub
		return (List<Patient>) ip.findAll();
	}

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removePatient(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

}
