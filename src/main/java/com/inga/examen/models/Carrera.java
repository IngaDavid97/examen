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
@Table(name = "carrera")
public class Carrera {
    
    
    private String nombre_carrera;
    private String carrera_descripcion;

    public Carrera() {
    }
    

    public Carrera(String nombre_carrera, String carrera_descripcion) {
        this.nombre_carrera = nombre_carrera;
        this.carrera_descripcion = carrera_descripcion;
    }
    
    
    
}
