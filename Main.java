package com.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CambiarPedro> lista = new ArrayList<CambiarPedro>();
        lista.add(new CambiarPedro("Marcela"));
        lista.add(new CambiarPedro("Claudia"));
        lista.add(new CambiarPedro("Samuel"));
        lista.add(new CambiarPedro("Jeremahia"));

        String nombreAInsertar = "Pedro";
        lista.add(1, new CambiarPedro(nombreAInsertar));
        
        for (CambiarPedro persona : lista) {
            System.out.println(persona.getNombre());
        }
    }
}

         