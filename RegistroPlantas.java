package com.example;

public class RegistroPlantas {
    private String Nombrecomun;
    private String Nombrecientifico;
    private String Tipo;
    private String Requerimentos;

    public String getNombrecomun() {
        return Nombrecomun;
    }

    public String getNombrecietifico() {
        return Nombrecientifico;
    }

    public String getTipo() {
        return Tipo;
    }

    public String requerimentos() {
        return Requerimentos;
    }

    public void setNombrecomun(String Nombrecomun) {
        this.Nombrecomun = Nombrecomun;
    }

    public void setNombrecientifico(String nombrecientifico) {
        Nombrecientifico = nombrecientifico;
    }

    public void setRequerimentos(String requerimentos) {
        Requerimentos = requerimentos;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public RegistroPlantas(String Nombrecomun, String Nombrecientifico, String tipo, String requerimentos) {
        this.Nombrecomun = Nombrecomun;
        this.Nombrecientifico = Nombrecientifico;
        this.Tipo = tipo;
        this.Requerimentos = requerimentos;
    }

} 

