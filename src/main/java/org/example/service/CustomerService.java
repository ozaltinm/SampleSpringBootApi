package org.example.service;

import org.example.model.Customer;

import java.util.HashMap;
import java.util.Map;

public interface CustomerService {

    public Customer getCustomer(Long id);

    public Customer createCustomer(Customer customer);
}
