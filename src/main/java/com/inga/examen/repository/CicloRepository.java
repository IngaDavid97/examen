package com.inga.examen.repository;


import com.inga.examen.models.Asignatura;
import com.inga.examen.models.Ciclo;
import com.inga.examen.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CicloRepository extends JpaRepository<Ciclo, Integer>{
    

}
