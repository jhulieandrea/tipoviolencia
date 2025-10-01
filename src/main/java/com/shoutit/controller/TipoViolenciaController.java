package com.shoutit.tipoviolencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.shoutit.tipoviolencia.model.tiposviolencia;
import com.shoutit.tipoviolencia.services.tipoviolenciaService;

/**
 * Controlador REST para manejar las operaciones CRUD 
 * de la entidad tiposviolencia.
 * 
 * @author JABorda
 */

@RestController
@RequestMapping("/tipoviolencia") // Ruta base del controlador
public class TipoViolenciaController {
    
    // Inyección automática del servicio que maneja la lógica de negocio
    @Autowired
    private tipoviolenciaService tipoviolenciaService;

    /**
     * Crear un nuevo registro de tipo de violencia.
     * @param newtiposviolencia objeto recibido en el cuerpo de la petición
     * @return el objeto guardado en la base de datos
     */
    @PostMapping("/nuevo")
    public tiposviolencia newtiposviolencia(@RequestBody tiposviolencia newtiposviolencia) {
        return this.tipoviolenciaService.newtiposviolencia(newtiposviolencia);
    }

    /**
     * Obtener todos los registros de tipos de violencia.
     * @return lista de tipos de violencia
     */
    @GetMapping("/mostrar")
    public Iterable<tiposviolencia> getAll() {
        return tipoviolenciaService.getAll();
    }

    /**
     * Modificar un registro existente de tipo de violencia.
     * @param tiposviolencia objeto con los datos actualizados
     * @return el objeto actualizado
     */
    @PostMapping("/modificar")
    public tiposviolencia updatetiposviolencia(@RequestBody tiposviolencia tiposviolencia) {
        return this.tipoviolenciaService.modifytiposviolencia(tiposviolencia);
    }

    /**
     * Eliminar un registro de tipo de violencia por su ID.
     * @param id identificador del registro a eliminar
     * @return true si fue eliminado, false si no existe
     */
    @DeleteMapping("/eliminar/{id}")
    public Boolean deletetiposviolencia(@PathVariable("id") Long id) {
        return tipoviolenciaService.deletetiposviolencia(id);
    }
}
