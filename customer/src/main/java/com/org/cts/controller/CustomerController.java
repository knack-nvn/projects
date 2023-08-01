package com.org.cts.controller;

import com.org.cts.model.Customer;
import com.org.cts.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer.com")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);

    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);

    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers(){
       return customerService.getAllCustomers();

    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
         customerService.deleteById(id);

    }

}
