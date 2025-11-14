package org.ejercicios;

public class Palindromo {

    public static boolean esPalindromo(String test) {
        String limpio = test.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return new StringBuilder(limpio).reverse().toString().equals(limpio);

    }
}
