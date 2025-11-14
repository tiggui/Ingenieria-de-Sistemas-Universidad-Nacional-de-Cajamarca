package org.ejercicios;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



import static org.junit.Assert.*;

public class calculadoraTestJUnit4 {


    private static Calculadora calc;

    @Before
    public void init(){
        calc = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    @Ignore
    public void testDivisionValida() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(10, 2);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {

        calc.dividir(10, 0);
    }


}
