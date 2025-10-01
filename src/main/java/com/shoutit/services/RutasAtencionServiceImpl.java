package com.shoutit.services;

import com.shoutit.model.RutasAtencion;
import com.shoutit.repository.RutasAtencionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RutasAtencionServiceImpl implements RutasAtencionService {

    private final RutasAtencionRepository repository;

    public RutasAtencionServiceImpl(RutasAtencionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RutasAtencion> findAll() {
        return repository.findAll();
    }

    @Override
    public RutasAtencion findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public RutasAtencion save(RutasAtencion ruta) {
        return repository.save(ruta);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
