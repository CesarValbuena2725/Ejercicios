package com.biblioteca.mantener;

public class General {
    private int codigo;
    private String nombre;

    public General(){

    }

    public General(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean validarDatos(){
        return true;
    }

    @SuppressWarnings("override")
    public String toString(){
        return "Codigo {" + codigo + " Nombre: " + nombre + '}';
    }

}
