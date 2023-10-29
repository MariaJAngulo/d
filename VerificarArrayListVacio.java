package com.example;
import java.util.ArrayList;

public class VerificarArrayListVacio {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        // Verificar si el ArrayList está vacío utilizando isEmpty
        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }

        // Agregar elementos al ArrayList
        lista.add("Elemento 1");
        lista.add("Elemento 2");

        // Verificar de nuevo si el ArrayList está vacío
        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }
    }
}

