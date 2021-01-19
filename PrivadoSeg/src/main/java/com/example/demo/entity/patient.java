package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class patient {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="nombre", unique=false, nullable=false)
	private String nombre;
	
	@Column(name="apellido", unique=false, nullable=false)
	private String apellido;
	
	@Column(name="edad", nullable=false)
	private int edad;
	
	@Column(name="direccion", nullable=false)
	private String direccion;
	
	@Column(name="fechaAlta", nullable=false)
	private Date fechaAlta;
	
	@Column(name="especialidad", nullable=false)
	private String especialidad;
	
	@Column(name="username", unique=true, nullable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
}
