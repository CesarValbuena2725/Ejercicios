package com.biblioteca.mantener;

public class Autor extends General{
    private String observacion;
    private int librosPublicados;
    private Pais pais;

    public Autor(){

    }

    public Autor(int codigo, String nombre, String observacion, int librosPublicados, Pais pais){
        super(codigo, nombre);
        this.observacion = observacion;
        this.librosPublicados = librosPublicados;
        this.pais = pais;
    }

    public void setObservacion(String observacion){
        this.observacion = observacion;
    }

    public String getObservacion(){
        return observacion;
    }


    public void setLibrosPublicados(int librosPublicados){
        this.librosPublicados = librosPublicados;
    }

    public int getLibrosPublicados(){
        return librosPublicados;
    }

   public void setPais(Pais pais){
        this.pais = pais;
    }

    public Pais getPais(){
        return pais;
    }
        

    @Override
    public String toString(){
        return "Libro {" + super.toString() + " Observacion: " + observacion + " Libros publicados: " + librosPublicados + " Pais: " + pais + "}";
    }
}

