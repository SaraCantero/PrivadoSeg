package com.example.demo.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
	import javax.persistence.Table;

	@Entity

	public class purchase_med {

		
		@Column (name="id")
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		private int id_medications;
		
		private int id_purchase;

}
