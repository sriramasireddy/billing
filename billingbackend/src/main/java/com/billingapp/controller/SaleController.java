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

import com.billingapp.model.Sale;
import com.billingapp.service.SaleService;

@CrossOrigin
@RestController
@RequestMapping ("/api/sale")
public class SaleController {
	
	@Autowired
	private SaleService service;

	@GetMapping
	public List<Sale> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Sale getById(@PathVariable Long id){
		return service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<Map<String, String>> create(@RequestBody Sale sale){
		return service.create(sale);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Map<String, String>> update(@PathVariable Long id, @RequestBody Sale sale){
		sale.setId(id);
		return service.update(sale);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Map<String, String>> patch(@PathVariable Long id, @RequestBody Sale sale){
		sale.setId(id);
		return service.update(sale);
	}
	
	

}
