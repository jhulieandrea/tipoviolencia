package com.shoutit.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad JPA que representa la tabla "rutaatencion" en la base de datos.
 * 
 * La anotación @Entity indica que esta clase es una entidad gestionada por JPA.
 * La anotación @Table permite especificar el nombre exacto de la tabla.
 * 
 * Con @Data (Lombok) se generan automáticamente:
 *   - Getters y Setters para todos los atributos
 *   - Métodos equals(), hashCode() y toString()
 */
@Entity
@Data
@Table(name = "rutaatencion")
public class RutasAtencion {

    /**
     * Clave primaria de la tabla.
     * Se genera automáticamente con estrategia IDENTITY (autoincremental).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDRutasAtencion;

    /**
     * Nombre de la ruta de atención.
     * No puede ser nulo y su longitud máxima es de 150 caracteres.
     */
    @Column(nullable = false, length = 150)
    private String NombreRutasAtencion;

    /**
     * Descripción detallada de la ruta de atención.
     * Se define como un campo de tipo TEXT en la base de datos,
     * permitiendo almacenar texto largo.
     */
    @Column(columnDefinition = "TEXT")
    private String DescripcionRutasAtencion;

    /**
     * Relación con el tipo de violencia al que pertenece la ruta.
     * Se almacena como clave foránea (id) hacia la tabla tipos de violencia.
    */
    @Column(name = "tipoViolencia_id")
    private Integer tipoViolenciaId;
}
