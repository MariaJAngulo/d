package com.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<UltimoArray> lista = new ArrayList<UltimoArray>();
        lista.add(new UltimoArray(17));
        lista.add(new UltimoArray(23));
        lista.add(new UltimoArray(13));
        lista.add(new UltimoArray(56));

        int tamaño = lista.size();
        if (tamaño > 0) {
            UltimoArray ultimoElemento = lista.get(tamaño - 1);
            System.out.println("El último elemento es: " + ultimoElemento.getNumeros());
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }
}



