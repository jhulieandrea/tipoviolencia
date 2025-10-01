package com.shoutit.tipoviolencia.repository;

// autor JhulieBorda
import org.springframework.data.jpa.repository.JpaRepository;

import com.shoutit.tipoviolencia.model.tiposviolencia;


public interface tipoviolenciaRepository extends JpaRepository<tiposviolencia, Long> {
    
}
