package com.billingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.billingapp.model.Sale;

public interface SaleRepository extends CrudRepository<Sale, Long> {

}
