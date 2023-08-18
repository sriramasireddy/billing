package com.billingapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billingapp.model.Bill;
import com.billingapp.service.BillService;

@RequestMapping("/api/bill")
@RestController
@CrossOrigin

public class BillController {

	@Autowired
	private BillService service;

	@GetMapping
	public List<Bill> getAll() {
		return service.getAll();
	}

	@PostMapping
	public ResponseEntity<Map<String, String>> create(@RequestBody Bill bill) {
		return service.create(bill);
	}
}
