package com.example.demo.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PatientEntity {

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
	
	@Column(name="fecha_alta", nullable=false)
	private Date fecha_alta;
	
	@Column(name="especialidad", nullable=false)
	private String especialidad;
	
	@Column(name="username", unique=true, nullable=false)
	private String username;
	
	@Column(name="password", nullable=false)
	private String password;
	
	
	public PatientEntity() {
		super();
	}
	
	public PatientEntity(int id, String nombre, String apellido, int edad, String direccion, Date fecha_alta, String especialidad, String username, String password) {
		
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
