package com.customer.customerInfo.controller;

import com.customer.customerInfo.model.Customer;
import com.customer.customerInfo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/A2B")
public abstract class CustomerController {
@Autowired CustomerService cus;

@PostMapping("/Create")
    public void create(@RequestBody CustomerService c ){
    cus.Create((Customer) c);
}

@PutMapping("/Update")
    public void update(@RequestBody CustomerService c) {
    cus.Update((Customer) c);
}

 /*@DeleteMapping("/Delete/{Id}")
 public void delete (@PathVariable int id){
      cus.delete byId (id);
}*/

@GetMapping("/Retrive")
    public abstract List<Customer> getAll();{
        cus.getAll();
    }

}

/*
package com.org.cts.controller;


        import com.org.cts.model.Employee;
        import com.org.cts.service.EmployeeService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public void createEmployeeRecord(@RequestBody Employee employee){
        employeeService.createEmployeeRecords(employee);
    }
}*/