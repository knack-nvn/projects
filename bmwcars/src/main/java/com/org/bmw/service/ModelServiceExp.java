package com.org.bmw.service;


import com.org.bmw.model.ModelName;
import com.org.bmw.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ModelServiceExp implements ModelService{

    @Autowired
    private ModelRepository modelRepository;
    private ModelName bmw;

    @Override
    public void create(ModelName bmw){
        this.bmw = bmw;
        modelRepository.save(bmw);
    }

    @Override
    public void update(ModelName bmw){
        modelRepository.save(bmw);
    }

    @Override
    public void deleteId(Integer id){
        modelRepository.save(bmw);
    }

    @Override
    public java.util.List<ModelName> GetAll(){
        return modelRepository.findAll();
    }


}

