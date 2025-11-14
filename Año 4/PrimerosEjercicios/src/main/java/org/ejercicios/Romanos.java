package org.ejercicios;

import java.util.Map;
import java.util.HashMap;

public class Romanos {

    public static int romanoAEnteros(String s) {

        Map<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);


        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int valor = mapa.get(s.charAt(i));

            if (valor < prev) {
                total -= valor;
            } else {
                total += valor;
            }

            prev = valor;
        }
        return total;

        //Progrma que devuelva una lista de productos,, obtenidos de una estructura de datos(arreglo, coleecio)

    }
}
