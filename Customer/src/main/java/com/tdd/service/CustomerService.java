
package com.tdd.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.tdd.repository.CustomerRepository;

@Service
public class CustomerService{

@Autowired
private CustomerRepository customerRepository;


}