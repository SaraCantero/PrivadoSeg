package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int edad;
	private String nombre, apellido, direccion, especialidad, username, password;
	private Date fecha_alta;
	
	public Patient(int id, String nombre, String apellido, int edad, String direccion, Date fecha_alta, String especialidad, String username, String password) {
		
		super();
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.direccion=direccion;
		this.fecha_alta=fecha_alta;
		this.especialidad=especialidad;
		this.username=username;
		this.password=password;
	}
	
	public Patient() {
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

	public Date getfecha_alta() {
		return fecha_alta;
	}

	public void setfecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	
}
