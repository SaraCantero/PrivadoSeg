package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="idPaciente", unique=true, nullable=false)
	private int idPaciente;
	
	@Column(name="idMedico", unique=true, nullable=false)
	private int idMedico;
	
	@Column(name="observaciones", nullable=false)
	private String observaciones;
	
	@Column(name="fecha", nullable=false)
	private Date fecha;
}
