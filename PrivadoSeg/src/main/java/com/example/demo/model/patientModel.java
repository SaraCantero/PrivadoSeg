package com.example.demo.model;

import java.sql.Date;

public class patientModel {

	private int id, edad;
	private String nombre, apellido, direccion, especialidad, username, password;
	private Date fechaAlta;
	
	public patientModel(int id, String nombre, String apellido, int edad, String direccion, Date fechaAlta, String especialidad, String username, String password) {
		
		super();
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.direccion=direccion;
		this.fechaAlta=fechaAlta;
		this.especialidad=especialidad;
		this.username=username;
		this.password=password;
	}
	
	public patientModel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
}
