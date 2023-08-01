package com.org.tcs.repository;

import com.org.tcs.model.SalesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<SalesModel,Integer> {
}
