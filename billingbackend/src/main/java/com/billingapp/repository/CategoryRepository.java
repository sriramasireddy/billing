package com.billingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.billingapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
