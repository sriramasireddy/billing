package com.billingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bill {
	@Id
	private int id;
	private int saleId;
	private int itemId;
	private int quantity;
	private int salePrice;
}
