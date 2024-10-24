package com.biblioteca.mantener;

public class Pais {
    private String nombre;

    public Pais(){

    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
