package com.example.crud_test.controller;

import com.example.crud_test.model.Crud;
import com.example.crud_test.service.CrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CrudController{
    private final CrudService crudService;

    public CrudController(CrudService crudService)
    {
        this.crudService = crudService;
    }
    @GetMapping("/getallCruds")
    public List<Crud> getallCruds(){
        return crudService.getallCruds();
    }
    @GetMapping("/get/{id}")
    public Crud getCrud(@PathVariable String id)
    {
        return crudService.getCrud(id);
    }
    @PostMapping("/create")
    public Crud create(@RequestBody Crud crud)
    {
        return crudService.create(crud);
    }
    @DeleteMapping("/deleteCrud/{id}")
    public String delete(@PathVariable String id)
    {
        crudService.delete(id);
        return "crud deleted";
    }
    @PutMapping("/updateCrud/{id}")
    public Crud update(@RequestBody Crud crud, @PathVariable String id)
    {
        return crudService.update(crud, id);
    }
    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        crudService.deleteAll();
        return "all crud deleted";
    }


}