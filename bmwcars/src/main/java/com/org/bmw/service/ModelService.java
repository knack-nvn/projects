package com.org.bmw.service;

import com.org.bmw.model.ModelName;

import java.util.List;

public interface ModelService {




   public void create(ModelName bmw);
    public void update(ModelName bmw);
    public void delete(Integer id);
    public List<ModelName>getAll();

    ModelName findModelNameById(Integer id);


    //void createModelrecords(ModelName bmw);
}
