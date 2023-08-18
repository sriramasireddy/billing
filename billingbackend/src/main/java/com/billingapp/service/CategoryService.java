package com.billingapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.billingapp.model.Category;
import com.billingapp.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> getAll() {
		Iterable<Category> iterator = repository.findAll();
		List<Category> list = new ArrayList<>();
		iterator.forEach(list::add);
		return list;
	}

	public Category getById(int id) {
		return repository.findById(id).get();
	}

	public ResponseEntity<Map<String, String>> create(Category category) {
		repository.save(category);
		Map<String, String> body=new HashMap<>();
		body.put("message", "Successfully created the category");
		ResponseEntity<Map<String, String>> response=new ResponseEntity<>(body, HttpStatus.CREATED);
		return response;
	}

	public ResponseEntity<Map<String, String>> update(Category category) {
		repository.save(category);
		Map<String, String> body=new HashMap<>();
		body.put("message", "Successfully updated the category");
		ResponseEntity<Map<String, String>> response=new ResponseEntity<>(body, HttpStatus.CREATED);
		return response;
	}

}
