package org.example.controller;

import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
       return customerService.createCustomer(customer);
    }
}
