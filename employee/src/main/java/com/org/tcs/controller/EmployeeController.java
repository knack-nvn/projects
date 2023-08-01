package com.org.tcs.controller;

import com.org.tcs.model.Employee;
import com.org.tcs.repository.EmployeeRepository;
import com.org.tcs.service.EmployeeService;
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
    public void CreateEmployee(@RequestBody Employee employee){
        employeeService.CreateEmployee(employee);
    }

}
