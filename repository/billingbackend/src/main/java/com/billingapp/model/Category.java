package com.billingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
	
	@Id 
	private int id;	
	private  String name;
	private String unit;
																																												
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	

}
