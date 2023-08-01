package com.org.cts.service;

import com.org.cts.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {

    public void createCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public void deleteById(Integer id);

    }
