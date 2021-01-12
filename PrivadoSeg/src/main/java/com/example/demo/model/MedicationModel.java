package com.example.demo.model;

public class MedicationModel {
	

	//prueba

	private int id;
	private String name;
	private String description;
	private String recipe;
	private float price;
	private int stock;
	
	
	public MedicationModel() {
		super();
	}


	public MedicationModel(int id, String name, String description, String recipe, float price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.recipe = recipe;
		this.price = price;
		this.stock = stock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getRecipe() {
		return recipe;
	}


	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	
	
}
