package com.billingapp.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sale {
	
	@Id
	private Long id;
	
	private Date dateSale;
	
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomers(Customer customer) {
		this.customer = customer;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}
	
	

}
