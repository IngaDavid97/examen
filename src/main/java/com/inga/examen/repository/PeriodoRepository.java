package com.inga.examen.repository;


import com.inga.examen.models.Asignatura;
import com.inga.examen.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;




public interface PeriodoRepository extends JpaRepository<Asignatura, Integer>{
    

}
