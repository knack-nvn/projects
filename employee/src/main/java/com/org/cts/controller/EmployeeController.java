package com.org.cts.controller;


import com.org.cts.model.Employee;
import com.org.cts.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public void createEmployeeRecord(@RequestBody Employee employee){
        employeeService.createEmployeeRecords(employee);
    }

    /*@GetMapping("/getByAddress/{empAddress}/")
    public String getempAddress(@PathVariable String c) {
        String s = getempAddress(c);
        return s;
    }*/

    @GetMapping("/retrieve/{empAddress}/")
    public Double getempAddress(@PathVariable String c) {
        Double s = getempAddress(c);
        return s;
    }


}
