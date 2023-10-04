package com.example;

public class Gestion {

    private String cliente;
    private String preferencias;
    private String recordatorios;

    public String getCliente() {
        return cliente;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public String getRecordatorios() {
        return recordatorios;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public void setRecordatorios(String recordatorios) {
        this.recordatorios = recordatorios;
    }

    public Gestion(String cliente, String preferencias, String recordatorios) {
        this.cliente = cliente;
        this.preferencias = preferencias;
        this.recordatorios = recordatorios;
    }

}