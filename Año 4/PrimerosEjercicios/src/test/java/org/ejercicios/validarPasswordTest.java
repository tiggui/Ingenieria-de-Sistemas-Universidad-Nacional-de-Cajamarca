package org.ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class validarPasswordTest {

    @Test
    void testPasswordFuerte(){
        validarPassword validador = new validarPassword();
        String result = validador.valida("PassFuerte123@*");
        assertEquals("Contraseña Fuerte :-)", result);
    }

    @Test
    void testPasswordDebil(){
        validarPassword validador = new validarPassword();
        String result = validador.valida("123");
        assertEquals("Contraseña Debil :-(", result);
    }
}
