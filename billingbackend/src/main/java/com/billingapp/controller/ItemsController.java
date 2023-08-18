package com.billingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billingapp.model.Items;
import com.billingapp.service.ItemsService;

@CrossOrigin
@RestController
@RequestMapping("/api/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;

	@GetMapping
	public List<Items> getAll() {
		return itemsService.getAll();
	
	}
	@GetMapping("/{id}")
	public Items getById (@PathVariable int id) {
		return itemsService.getById(id);
	}
	
	

}
