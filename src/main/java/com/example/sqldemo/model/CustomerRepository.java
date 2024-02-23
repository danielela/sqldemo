package com.example.sqldemo.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Customer findById(int id);

}
