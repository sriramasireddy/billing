package com.billingapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.billingapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
