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
@Table(name = "periodo")
public class Periodo {
    private String perido;
    private String año;

    public Periodo() {
    }

    public Periodo(String perido, String año) {
        this.perido = perido;
        this.año = año;
    }
    
    
    
    
}
