package com.shoutit.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rutaatencion")
public class RutasAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDRutasAtencion;

    @Column(nullable = false, length = 150)
    private String NombreRutasAtencion;

    @Column(columnDefinition = "TEXT")
    private String DescripcionRutasAtencion;

    @Column(name = "tipoViolencia_id")
    private Integer tipoViolenciaId;
}
