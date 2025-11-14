package org.ejercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class MecanicoTest {

    private GestorMecanicos mecanico;

    @BeforeEach
    public void setUp() {
        mecanico = new GestorMecanicos();
    }

    @Test
    public void testAgregarMecanico() {

        Mecanico mecanico1 = new Mecanico(23, "Alex", "Car", true, "9999","Frenos"  );
        mecanico.agregarMecanico(mecanico1);

        assertEquals("Mecanico{" +
                "nombre=Alex" +
                ", apellido=Car" +
                ", id_empleado=23" +
                ", especialidades=Frenos" +
                ", telefono_contacto=9999" +
                ", activo=true" +
                '}', mecanico.obtenerMecanico(23).toString());
    }


    @Test
    public void testActualizarMecanico(){

        Mecanico mecanico1 = new Mecanico(23, "Alex", "Car", true, "9999","Frenos"  );
        mecanico.agregarMecanico(mecanico1);

        Mecanico mecanico2 = new Mecanico(23, "Alex", "Caruajulca", true, "9999","Frenos"  );
        mecanico.actualizarMecanico(mecanico2);

        assertEquals("Mecanico{" +
                "nombre=Alex" +
                ", apellido=Caruajulca" +
                ", id_empleado=23" +
                ", especialidades=Frenos" +
                ", telefono_contacto=9999" +
                ", activo=true" +
                '}', mecanico.obtenerMecanico(23).toString());

    }



}
