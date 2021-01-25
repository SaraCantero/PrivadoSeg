package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Appointment;

public interface AppointmentService {

	public abstract List <Appointment> listAllAppointment();
	public abstract Appointment addAppointment(Appointment appointment);
	public abstract int removeAppointment(int id);
	public abstract Appointment updateAppointment(Appointment appointment);
}
