package com.example.sqldemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.sqldemo.model.Customer;
import com.example.sqldemo.services.CustomerService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    // @GetMapping("/customer")
    // public String getCustomer() {
    //     return "Hello from CustomerController";
    // }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer) {
        System.out.println("the customer input name is: " + customer.getFirstName() + " " + customer.getLastName());
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/getCustomer")
    public Customer getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }

}
