package org.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import org.ejercicios.Mecanico;

public class GestorMecanicos {
    public List<Mecanico> mecanicos;

    public GestorMecanicos() {
        this.mecanicos = new ArrayList<>();
    }

    public void agregarMecanico(Mecanico meca) {
        mecanicos.add(meca);
    }

    public void actualizarMecanico(Mecanico m){

        for (Mecanico m2 : mecanicos){
            if (m2.getId_empleado() == m.getId_empleado()){
                m2.setNombre(m.getNombre()) ;
                m2.setApellido(m.getApellido()); ;
                m2.setTelefono_contacto(m.getTelefono_contacto()); ;
                m2.setEspecialidades(m.getEspecialidades()); ;
                m2.setActivo(m.isActivo());

            }
        }
    }

    public Mecanico obtenerMecanico(int id_empleado){
        for (Mecanico m : mecanicos){
            if (id_empleado == m.getId_empleado()){
                return m;
            }
        }
        return null;
    }

    public void listarEspecialidad (String especialidad){
        for (Mecanico m : mecanicos){
            if (especialidad == m.getEspecialidades()){

            }
        }

    }

    public List<Mecanico> obtenerMecanicos() {
        return mecanicos;
    }

    public void eliminarMecanicos() {
        mecanicos.clear();
    }
}
