package com.example.customerlist.services.impl;

import com.example.customerlist.models.Customer;
import com.example.customerlist.repository.IRepository;
import com.example.customerlist.repository.impl.CustomerRepository;
import com.example.customerlist.services.IService;

import java.util.List;

public class CustomerServiceFactory implements IService {
    IRepository customerRepository = new CustomerRepository();
    private static IService instance;

    private CustomerServiceFactory() {
    }
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public synchronized static IService getInstance() {
        if (instance == null) {
            instance = new CustomerServiceFactory();
        }
        return instance;
    }

}
