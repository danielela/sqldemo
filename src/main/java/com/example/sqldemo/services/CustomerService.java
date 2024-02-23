package com.example.sqldemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sqldemo.model.Customer;
import com.example.sqldemo.model.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String saveCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return "Success saved customer with id: " + savedCustomer.getCustomerId();
    }

    public Customer getCustomer(int id) {
        return customerRepository.findById(id);
    }

}
