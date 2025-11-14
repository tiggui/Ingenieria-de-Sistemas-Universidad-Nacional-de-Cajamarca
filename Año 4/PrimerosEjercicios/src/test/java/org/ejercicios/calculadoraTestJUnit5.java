package org.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}
