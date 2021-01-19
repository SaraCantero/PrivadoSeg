package com.example.demo.model;

import java.sql.Date;

public class appointmentModel {

	private int id, idPaciente, idMedico;
	private String observaciones;
	private Date fecha;
	
	public appointmentModel(int id, int idPaciente, int idMedico, String observaciones, Date fecha) {
		
		super();
		this.id=id;
		this.idPaciente=idPaciente;
		this.idMedico=idMedico;
		this.observaciones=observaciones;
		this.fecha=fecha;
	}
	
	public appointmentModel() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
