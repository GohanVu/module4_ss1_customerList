package com.example.customerlist.repository;

import com.example.customerlist.models.Customer;

import java.util.List;

public interface IRepository {
    List<Customer> findAll();
}
