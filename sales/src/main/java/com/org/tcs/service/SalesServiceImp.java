package com.org.tcs.service;

import com.org.tcs.model.SalesModel;
import com.org.tcs.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImp implements SalesService{

    @Autowired
    SalesRepository salesRepository;

    @Override
    public void createSalesModel(SalesModel salesModel){
        salesRepository.save(salesModel);
    }

}
