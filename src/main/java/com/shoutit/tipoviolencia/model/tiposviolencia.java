
package com.shoutit.tipoviolencia.model;

// @author JABorda
// Clase para elaborar la entidad de la aplicación tipos de violencia
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class tiposviolencia {
    @Id
    @Column
    private Long Id_Tipo_Violencia;
    
    @Column    
    private String Nombre_Tipo_Violencia;
    
    @Column
    private String Descripcion;
    
    
}
