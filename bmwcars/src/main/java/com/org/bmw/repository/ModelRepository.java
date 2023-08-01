package com.org.bmw.repository;

import com.org.bmw.model.ModelName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<ModelName, Integer> {

}
