package org.ejercicios;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private static Calculadora calc;

    @Before
    public void init(){
        calc = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {

        calc.dividir(10, 0);
    }
}
