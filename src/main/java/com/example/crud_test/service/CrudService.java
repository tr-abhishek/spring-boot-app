package com.example.crud_test.service;

import com.example.crud_test.model.Crud;
import com.example.crud_test.repository.CrudRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CrudService{
    
    private final CrudRepository crudRepository;

    public CrudService(CrudRepository crudRepository)
    {
        this.crudRepository = crudRepository;
    }

    public List<Crud> getallCruds(){
        return  crudRepository.findAll();
    }

    public Crud getCrud(String id)
    {
        return crudRepository.findById(id).orElse(null);
    }

    public Crud create(Crud crud)
    {
        return crudRepository.save(crud);
    }

    public void delete(String id)
    {
        crudRepository.deleteById(id);
    }

    public Crud update(Crud crud, String id)
    {
        Crud crud1 = crudRepository.findById(id).get();
        crud1.setAuthor(crud.getAuthor());
        crud1.setPublisher(crud.getPublisher());
        crud1.setGenre(crud.getGenre());
        crudRepository.save(crud1);
        return crud1;
    }

    public void deleteAll(){
        crudRepository.deleteAll();
    }
}