package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class medication {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String description;
	
	@Column (name="name")
	
	private String name;
	
	private String recipe;
	
	private float price;
	
	private int stock;
	
	

}
