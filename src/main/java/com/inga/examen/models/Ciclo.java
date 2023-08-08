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
@Table(name = "ciclo")
public class Ciclo {
    
    private String ciclo;
    private String descripcion;

    public Ciclo() {
    }

    public Ciclo(String ciclo, String descripcion) {
        this.ciclo = ciclo;
        this.descripcion = descripcion;
    }
    
    
    


    
    
    
}
