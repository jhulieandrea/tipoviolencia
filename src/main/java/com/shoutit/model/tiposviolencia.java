package com.shoutit.tipoviolencia.model;

// @author JABorda
// Clase para elaborar la entidad de la aplicación tipos de violencia

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Data
@NoArgsConstructor // ✅ Constructor sin argumentos para Jackson

public class tiposviolencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Generación automática del ID
    @Column
    @JsonProperty("Id_Tipo_Violencia")
    private Long Id_Tipo_Violencia;

    @Column
    @JsonProperty("Nombre_Tipo_Violencia") // ✅ Mapea el campo JSON
    private String Nombre_Tipo_Violencia;

    @Column
    @JsonProperty("Descripcion") // ✅ Mapea el campo JSON
    private String Descripcion;

    // ✅ Constructor 
    public tiposviolencia(String Nombre_Tipo_Violencia, String Descripcion) {
        this.Nombre_Tipo_Violencia = Nombre_Tipo_Violencia;
        this.Descripcion = Descripcion;
    }
}