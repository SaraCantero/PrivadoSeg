package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;

public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	@Qualifier("appointmentRepository")
	private AppointmentRepository appointmentRepository;
	
	@Override
	public List<Appointment> listAllAppointment() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public int removeAppointment(int id) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(id);
		return 0;
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

}
