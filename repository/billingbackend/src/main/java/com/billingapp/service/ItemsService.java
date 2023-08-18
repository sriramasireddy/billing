package com.billingapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingapp.model.Items;
import com.billingapp.repository.ItemsRepository;

@Service

public class ItemsService {
	@Autowired
	private ItemsRepository itemsRepository;

	public List<Items> getAll() {
		Iterable<Items> iterator = itemsRepository.findAll();
		List<Items> list = new ArrayList<>();
		iterator.forEach(list::add);
		return list;
	}

	public Items getById(int id) {
		// TODO Auto-generated method stub
		return itemsRepository.findById(id).get();
	}

}


