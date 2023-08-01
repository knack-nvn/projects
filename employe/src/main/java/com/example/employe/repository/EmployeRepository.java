package com.example.employe.repository;

import com.example.employe.model.EmployeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeModel,Integer> {
}
