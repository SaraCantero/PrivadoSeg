package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class purchase {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@Column(name="precio", nullable=false)
	private int precio;
	
	@Column(name="idPaciente", nullable=false)
	private int idPaciente;
}
