package com.billingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.billingapp.model.Bill;

public interface BillRepository extends CrudRepository<Bill, Integer> {

}
