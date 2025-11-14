package org.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTestJUnit5 {

    private Calculadora calc;

    @BeforeEach
    public void init(){
        this.calc = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(7, calc.sumar(3, 4));
    }

    @Test
    public void testDivisionValida() {
        double resultado = calc.dividir(10, 2);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}
