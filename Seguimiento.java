package com.example;

public class Seguimiento {
    int fechariego;
    String abonado;
    String trasplantes;
    String otroevento;

    public String getAbonado() {
        return abonado;
    }

    public int getFechariego() {
        return fechariego;
    }

    public String getOtroevento() {
        return otroevento;
    }

    public String getTrasplantes() {
        return trasplantes;
    }

    public void setAbonado(String abonado) {
        this.abonado = abonado;
    }

    public void setFechariego(int fechariego) {
        this.fechariego = fechariego;
    }

    public void setOtroevento(String otroevento) {
        this.otroevento = otroevento;
    }

    public void setTrasplantes(String trasplantes) {
        this.trasplantes = trasplantes;
    }

    public Seguimiento(int fechariego, String abonado, String trasplantes, String otroevento) {
        this.fechariego = fechariego;
        this.abonado = abonado;
        this.trasplantes = trasplantes;
        this.otroevento = otroevento;
    }
}

