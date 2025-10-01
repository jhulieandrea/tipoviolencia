package com.shoutit.tipoviolencia.services;

import com.shoutit.tipoviolencia.model.tiposviolencia;


// JABorda


public interface tipoviolenciaService {
    tiposviolencia newtiposviolencia (tiposviolencia newtiposviolencia);
    Iterable<tiposviolencia> getAll ();
    tiposviolencia modifytiposviolencia (tiposviolencia tiposviolencia);
    Boolean deletetiposviolencia (long Id_Tipo_Violencia);
            
}
