package net.javaguide.springboot.repository;

import net.javaguide.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //all CRUD database methods.
}
