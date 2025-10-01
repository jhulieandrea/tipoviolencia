package com.shoutit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shoutit.model.RutasAtencion;

@Repository
public interface RutasAtencionRepository extends JpaRepository<RutasAtencion, Integer> {
}