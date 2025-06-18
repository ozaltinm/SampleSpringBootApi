package org.example.service.impl;

import org.example.exception.CustomerNotFoundException;
import org.example.model.Customer;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

/*    private static final Map<Long, Customer> CUSTOMER_DB = new HashMap<>();

    public CustomerServiceImpl() {
        CUSTOMER_DB.put(1L, new Customer(1L, "Ebru Saygili", "ebru@example.com"));
        CUSTOMER_DB.put(2L, new Customer(2L, "Okcan Saygili", "okcan@example.com"));
    }*/

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Long id){
        /*Customer customer = CUSTOMER_DB.get(id);
        if(customer == null){
            throw new CustomerNotFoundException(id);
        }
        return customer;*/
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
    }

    @Override
    public Customer createCustomer(Customer customer){
        /*Long nextId = CUSTOMER_DB.keySet().stream().max(Long::compare).orElse(0L) + 1;
        customer.setId(nextId);
        CUSTOMER_DB.put(nextId,customer);
        return customer;*/
        return customerRepository.save(customer);
    }
}
