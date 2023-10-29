package com.example;

public class CambiarPedro {
    private String Nombre;

    public CambiarPedro(){

    }
    public CambiarPedro(String Nombre){
        this.Nombre=Nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
