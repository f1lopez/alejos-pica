package com.trayectos.ejemplo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trayectos.ejemplo.dataAccess.PersonaRepository;
import com.trayectos.ejemplo.logic.PersonaLogic;
import com.trayectos.ejemplo.model.Persona;

@RestController
public class PersonaController {

    @Autowired
    PersonaLogic personaLogic;

    @Autowired
    PersonaRepository personas;

    @GetMapping("/personas")
    public List<Persona> getAllPersonas() {
        return personas.findAll();
    }
    

    @PostMapping("/personas")   
    public Persona crearPersona(@RequestBody Persona p) throws Exception {
        return personaLogic.crearPersona(p);
    }
}
