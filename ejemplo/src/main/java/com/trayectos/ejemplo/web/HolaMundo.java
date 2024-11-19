package com.trayectos.ejemplo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HolaMundo {
    @GetMapping("/")
    public String hola() {
        return "hola mundo";
    }
    
}