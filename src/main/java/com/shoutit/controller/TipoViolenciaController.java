
package com.shoutit.tipoviolencia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.shoutit.tipoviolencia.model.tiposviolencia;
import com.shoutit.tipoviolencia.services.tipoviolenciaService;



/**
 *
 * @author JABorda
 */

@RestController
@RequestMapping ("/tipoviolencia")
public class TipoViolenciaController {
    
    @Autowired
    private tipoviolenciaService tipoviolenciaService;

    @PostMapping ("/nuevo")

    public tiposviolencia newtiposviolencia(@RequestBody tiposviolencia newtiposviolencia ){
        return this.tipoviolenciaService.newtiposviolencia(newtiposviolencia);

    }
    @GetMapping ("/mostrar")
    public Iterable<tiposviolencia> getAll (){
        return tipoviolenciaService.getAll();
    }

    @PostMapping("modificar")
    public tiposviolencia updatetiposviolencia(@RequestBody tiposviolencia tiposviolencia ){
    return  this.tipoviolenciaService.modifytiposviolencia (tiposviolencia);
}
    @DeleteMapping("/eliminar/{id}")
    public Boolean deletetiposviolencia(@PathVariable("id") Long id) {
    return tipoviolenciaService.deletetiposviolencia(id);
}
    
}
