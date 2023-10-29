package com.example;

public class CambiarNombre {
    private String Nombre;

    public CambiarNombre(){

    }
    public CambiarNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
