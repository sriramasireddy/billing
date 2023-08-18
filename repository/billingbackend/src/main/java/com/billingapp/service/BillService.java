package com.billingapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.billingapp.model.Bill;
import com.billingapp.repository.BillRepository;
@Service
public class BillService {
	@Autowired
	private BillRepository repository;

	public List<Bill> getAll() {
		Iterable<Bill> iterator = repository.findAll();
		List<Bill> list = new ArrayList<>();
		iterator.forEach(list::add);
		return list;
	}

	public ResponseEntity<Map<String, String>> create(Bill bill) {
		repository.save(bill);
		Map<String, String> body=new HashMap<>();
		body.put("message", "Successfully created the category");
		ResponseEntity<Map<String, String>> response=new ResponseEntity<>(body, HttpStatus.CREATED);
		return response;
	} 

}
