package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;



@Service("doctorService")
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	@Qualifier ("doctorRepository")
	private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> listAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor addCourse(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public int removeDoctor(int id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
		return 0;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

}
