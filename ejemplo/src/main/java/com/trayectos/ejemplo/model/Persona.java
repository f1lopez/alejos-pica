package com.trayectos.ejemplo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Persona {

    @Id
    public Integer id;
    public String nombre;
    public String email;
}
