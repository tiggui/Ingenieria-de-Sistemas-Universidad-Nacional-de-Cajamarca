package org.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanosTest {


    @Test
    void testRomanosAEnterosBasico(){
        assertEquals(3,Romanos.romanoAEnteros("III"));
    }

    @Test
    void testRomanosAEnteroAvanzado(){
        assertEquals(4,Romanos.romanoAEnteros("IV"));
        assertEquals(9,Romanos.romanoAEnteros("IX"));
        assertEquals(57,Romanos.romanoAEnteros("LVII"));
        assertEquals(1994,Romanos.romanoAEnteros("MCMXCIV"));


    }
}
