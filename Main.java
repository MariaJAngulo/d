package com.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CambiarArrayli> lista = new ArrayList<CambiarArrayli>();
        lista.add(new CambiarArrayli(17));
        lista.add(new CambiarArrayli(23));
        lista.add(new CambiarArrayli(13));
        lista.add(new CambiarArrayli(56));

        System.out.println("ArrayList original: " + numeros);

        CambiarArrayli.clear();

        System.out.println("ArrayList después de eliminar todos los elementos: " + numeros);
    
    }
}


