package com.billingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.billingapp.model.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer> {

}
