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

import com.billingapp.model.Category;
import com.billingapp.service.CategoryService;

@CrossOrigin
@RestController
@RequestMapping ("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;

	@GetMapping
	public List<Category> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Category getById(@PathVariable int id){
		return service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<Map<String, String>> create(@RequestBody Category category){
		return service.create(category);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Map<String, String>> update(@PathVariable int id, @RequestBody Category category){
		category.setId(id);
		return service.update(category);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Map<String, String>> patch(@PathVariable int id, @RequestBody Category category){
		category.setId(id);
		return service.update(category);
	}
	
	

}
