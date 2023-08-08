package com.inga.examen.repository;


import com.inga.examen.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfesorRepository extends MongoRepository<Profesor, Integer>{
    

}
