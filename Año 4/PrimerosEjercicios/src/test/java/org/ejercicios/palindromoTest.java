package org.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class palindromoTest {

    @Test
    void testPalindromoBasico(){
        assertTrue(Palindromo.esPalindromo("Anita lava la tina"));
        assertFalse(Palindromo.esPalindromo("Hola Mundo"));
    }
    @Test
    void testPalindromoAvanzado(){
        assertTrue(Palindromo.esPalindromo("A man a plan, a canal: Panama"));
        assertFalse(Palindromo.esPalindromo("Hola Mundo"));
    }
}
