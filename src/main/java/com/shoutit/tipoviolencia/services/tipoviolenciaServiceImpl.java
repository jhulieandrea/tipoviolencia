/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.shoutit.tipoviolencia.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoutit.tipoviolencia.model.tiposviolencia;
import com.shoutit.tipoviolencia.repository.tipoviolenciaRepository;

/**
 *
 * @author JABorda
 */
//implementacion

@Service

public class tipoviolenciaServiceImpl implements tipoviolenciaService {

    @Autowired
    private tipoviolenciaRepository tipoviolenciaRepository; 

    @Override
    public tiposviolencia newtiposviolencia(tiposviolencia newtiposviolencia) {
        return tipoviolenciaRepository.save(newtiposviolencia);
    }

    @Override
    public Iterable<tiposviolencia> getAll() {
        return this.tipoviolenciaRepository.findAll();
    }

    @Override
    public tiposviolencia modifytiposviolencia(tiposviolencia tiposviolencia) {


        Optional<tiposviolencia> tipoviolenciaEncontrado= this.tipoviolenciaRepository.findById(tiposviolencia.getId_Tipo_Violencia());
        if(tipoviolenciaEncontrado.get()!=null) {
        tipoviolenciaEncontrado.get().setNombre_Tipo_Violencia(tiposviolencia.getNombre_Tipo_Violencia());
        tipoviolenciaEncontrado.get().setDescripcion(tiposviolencia.getDescripcion());
        return this.newtiposviolencia(tipoviolenciaEncontrado.get());

        }
        return null;
    }

    @Override
    public Boolean deletetiposviolencia(long Id_Tipo_Violencia) {
        this.tipoviolenciaRepository.deleteById(Id_Tipo_Violencia);
        return true;    
    
    }

}
