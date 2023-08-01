package com.org.cts.service;

import com.org.cts.model.Employee;
import com.org.cts.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployeeRecords(Employee e) {
        employeeRepository.save(e);
    }

    /*public List<Employee> getempAddress(String a){
        List<Employee> l= employeeRepository.findByempAddress(a);
        return l;
    }*/

    public Double getsumSalaryfromAdd (String add){
        Double count = null;
        List<Employee> l= employeeRepository.findByempAddress(add);

        for (int i=0;i<l.size();i++)
        {
            Employee e= l.get(i);
            count=count+e.getEmpSalary();
        }
        return count;


    }

}
