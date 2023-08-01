package com.example.employe.controller;

import com.example.employe.model.EmployeModel;
import com.example.employe.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeController {
    @Autowired
    EmployeRepository employeRepository;

    @PostMapping("/create")
public void cre(@RequestBody EmployeModel employeModel){
    employeRepository.save(employeModel);
    }
    @GetMapping("/get")
    public List<EmployeModel> get(){
        return employeRepository.findAll();
    }
}