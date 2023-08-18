package com.billingapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.billingapp.model.Sale;
import com.billingapp.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	public List<Sale> getAll() {
		List<Sale> list = new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}

	public Sale getById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public ResponseEntity<Map<String, String>> create(Sale sale) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<Map<String, String>> update(Sale sale) {
		// TODO Auto-generated method stub
		return null;
	}

}
