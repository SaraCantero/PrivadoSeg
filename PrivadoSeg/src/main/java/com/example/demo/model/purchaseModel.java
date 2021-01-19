package com.example.demo.model;

import java.sql.Date;

//prueba
public class purchaseModel {

	private int id, precio, idPaciente;
	private Date fecha;
	
	public purchaseModel(int id, Date fecha, int precio, int idPaciente) {
		
		super();
		this.id=id;
		this.fecha=fecha;
		this.precio=precio;
		this.idPaciente=idPaciente;
	}
	
	public purchaseModel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
