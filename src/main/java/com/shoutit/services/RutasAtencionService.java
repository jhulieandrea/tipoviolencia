package com.shoutit.services;

import com.shoutit.model.RutasAtencion;
import java.util.List;

public interface RutasAtencionService {
    List<RutasAtencion> findAll();
    RutasAtencion findById(Integer id);
    RutasAtencion save(RutasAtencion ruta);
    void delete(Integer id);
}