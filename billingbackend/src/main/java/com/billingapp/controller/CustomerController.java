package com.billingapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billingapp.model.Customer;
import com.billingapp.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping ("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@GetMapping
	public List<Customer> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Customer getById(@PathVariable Long id){
		return service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<Map<String, String>> create(@RequestBody Customer customer){
		return service.create(customer);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Map<String, String>> update(@PathVariable Long id, @RequestBody Customer customer){
		customer.setId(id);
		return service.update(customer);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Map<String, String>> patch(@PathVariable Long id, @RequestBody Customer customer){
		customer.setId(id);
		return service.update(customer);
	}
	
	

}
