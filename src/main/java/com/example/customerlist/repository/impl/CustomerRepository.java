package com.example.customerlist.repository.impl;

import com.example.customerlist.models.Customer;
import com.example.customerlist.repository.IRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IRepository {
    static  List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1,"HoangTT","hoangtt@gmail.com","HN"));
        customers.add(new Customer(2,"HoangTT2","hoangtt@gmail.com","HN1"));
        customers.add(new Customer(3,"HoangTT3","hoangtt@gmail.com","HN2"));
        customers.add(new Customer(4,"HoangTT4","hoangtt@gmail.com","HN3"));

    }


    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
