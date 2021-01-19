package com.example.demo.model;

import javax.xml.crypto.Data;
import javax.persistence.Entity;

public class Purchase_medModel {

	private int id_medications;
	private int id_purchase;

	
	public Purchase_medModel() {
		super();
	}

	public Purchase_medModel(int id_medications, int id_buy) {
		super();
		this.id_medications = id_medications;
		this.id_purchase = id_buy;
	}

	public int getId_medications() {
		return id_medications;
	}

	public void setId_medications(int id_medications) {
		this.id_medications = id_medications;
	}

	public int getId_purchase() {
		return id_purchase;
	}

	public void setId_purchase(int id_purchase) {
		this.id_purchase = id_purchase;
	}
	
	
	
	
	
}
