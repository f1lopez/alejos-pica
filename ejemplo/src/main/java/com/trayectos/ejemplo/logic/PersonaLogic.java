package com.trayectos.ejemplo.logic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trayectos.ejemplo.dataAccess.PersonaRepository;
import com.trayectos.ejemplo.model.Persona;

@Service
public class PersonaLogic {
    @Autowired
    PersonaRepository personas;

    public Persona crearPersona(
        Persona p
    ) throws Exception {
        Optional<Persona> otraPersonaConEseId = personas.findById(p.getId());
        if (otraPersonaConEseId.isPresent())
        throw new Exception("Ya existe una persona con ese id");

        Optional<Persona> otraPersonaConEseEmail = personas.findByEmail(p.getEmail());
        if (otraPersonaConEseEmail.isPresent())
        throw new Exception("Ya existe una persona con ese email");

        if (p.getNombre() == null || p.getNombre().equals(""))
        throw new Exception("Nombre vacio");

        Persona personasEnBd = personas.save(p);
        return personasEnBd;
    }
}
