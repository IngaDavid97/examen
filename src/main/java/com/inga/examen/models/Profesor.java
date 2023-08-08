package com.inga.examen.models;


import java.io.Serializable;



import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {

   private String profe_nombre;
   private String profe_apellido;
   private String profe_celular;
   private String profe_correo;
   private String profe_direccion;

    public Profesor() {
    }
   
   

    public Profesor(String profe_nombre, String profe_apellido, String profe_celular, String profe_correo, String profe_direccion) {
        this.profe_nombre = profe_nombre;
        this.profe_apellido = profe_apellido;
        this.profe_celular = profe_celular;
        this.profe_correo = profe_correo;
        this.profe_direccion = profe_direccion;
    }
   
   
   
   
    

}
