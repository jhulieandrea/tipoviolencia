package com.shoutit.controller;

import com.shoutit.model.RutasAtencion;
import com.shoutit.services.RutasAtencionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rutasatencion")
public class RutasAtencionController {

    private final RutasAtencionService service;

    public RutasAtencionController(RutasAtencionService service) {
        this.service = service;
    }

    @GetMapping
    public List<RutasAtencion> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RutasAtencion getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public RutasAtencion create(@RequestBody RutasAtencion ruta) {
        return service.save(ruta);
    }

    @PutMapping("/{id}")
    public RutasAtencion update(@PathVariable Integer id, @RequestBody RutasAtencion ruta) {
        RutasAtencion existing = service.findById(id);
        if (existing != null) {
            existing.setNombreRutasAtencion(ruta.getNombreRutasAtencion());
            existing.setDescripcionRutasAtencion(ruta.getDescripcionRutasAtencion());
            existing.setTipoViolenciaId(ruta.getTipoViolenciaId());
            return service.save(existing);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}