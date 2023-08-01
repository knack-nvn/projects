package com.org.tcs.controller;


import com.org.tcs.model.SalesModel;
import com.org.tcs.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales.com")

public class SalesController {

@Autowired
  SalesService salesService;

    @PostMapping("/create")
    public void createSalesModel(@RequestBody SalesModel salesModel){
    salesService.createSalesModel(salesModel);
    }


}
