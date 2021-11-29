package com.example.crud_test.repository;

import com.example.crud_test.model.Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<Crud, String>{
    
}