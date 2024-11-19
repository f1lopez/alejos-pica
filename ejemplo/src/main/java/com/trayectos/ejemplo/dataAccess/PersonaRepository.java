package com.trayectos.ejemplo.dataAccess;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trayectos.ejemplo.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

    public Optional<Persona> findByEmail(String email);
}
