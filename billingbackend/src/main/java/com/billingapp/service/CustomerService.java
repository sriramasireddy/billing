package com.billingapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.billingapp.model.Customer;
import com.billingapp.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;

	public List<Customer> getAll() {
		List<Customer> list = new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}

	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<Map<String, String>> create(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<Map<String, String>> update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
