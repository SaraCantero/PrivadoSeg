package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String username;
	
	@Column (name="name")
	
	private String name;
	
	private String last_name;
	
	private String specialty;
	
	private int age;
	
	private Date date;
	
	private String password;
	

}
