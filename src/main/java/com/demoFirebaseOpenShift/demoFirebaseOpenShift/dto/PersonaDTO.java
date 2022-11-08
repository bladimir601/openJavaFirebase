package com.demoFirebaseOpenShift.demoFirebaseOpenShift.dto;

import java.io.Serializable;

public class PersonaDTO implements Serializable {

    private String id;
    private String nombre;
    private Integer edad;

    public PersonaDTO(){}

    public PersonaDTO(String id,String nombre, Integer edad) {
        this.id=id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
