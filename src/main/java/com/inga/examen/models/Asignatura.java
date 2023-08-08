/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inga.examen.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@Entity
@Table(name = "asignatura")
public class Asignatura {
    
    private String nombre_asignatura;
    private Integer n_horas;
    private Integer n_horas_prac;
    private Integer n_horas_autonomas;

    public Asignatura() {
    }
    
    

    public Asignatura(String nombre_asignatura, Integer n_horas, Integer n_horas_prac, Integer n_horas_autonomas) {
        this.nombre_asignatura = nombre_asignatura;
        this.n_horas = n_horas;
        this.n_horas_prac = n_horas_prac;
        this.n_horas_autonomas = n_horas_autonomas;
    }
    
    
    
    
    
}
