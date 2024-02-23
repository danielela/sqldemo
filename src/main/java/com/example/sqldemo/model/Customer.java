package com.example.sqldemo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    // public Customer() {
    // }

    // @AllArgsConstructor
    // public Customer(int id, String firstName, String lastName, String email,
    // String phone, Date birthDate) {
    // this.customerId = id;
    // this.firstName = firstName;
    // this.lastName = lastName;
    // this.email = email;
    // this.phone = phone;
    // this.birthDate = birthDate;
    // }

    @Id
    @GeneratedValue
    private int customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_date")
    private Date birthDate;

}
