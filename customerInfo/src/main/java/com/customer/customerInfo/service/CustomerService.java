package com.customer.customerInfo.service;

import com.customer.customerInfo.model.Customer;
import com.customer.customerInfo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    public void Create(Customer c);
    public void Update(Customer c);
    public void Delete(Customer c);
    public List<Customer>getAll();
}

@Service
abstract
class NewCustomer implements CustomerService
{
    @Autowired CustomerRepository rep;

    public void Create(Customer c) {
        rep.save(c);
    }
    public void update(Customer c) {
        rep.save(c);
    }
    /*public void Delete void Id(int id) {
    rep.Delete by Id(id);
}*/
public List<Customer> getAll() {
    return rep.findAll();
}
}


/*package com.org.cts.service;

import com.org.cts.model.Employee;

public interface EmployeeService {

    public void createEmployeeRecords(Employee e);
}


package com.org.cts.service;

import com.org.cts.model.Employee;
import com.org.cts.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployeeRecords(Employee e) {
        employeeRepository.save(e);
    }
}


*/