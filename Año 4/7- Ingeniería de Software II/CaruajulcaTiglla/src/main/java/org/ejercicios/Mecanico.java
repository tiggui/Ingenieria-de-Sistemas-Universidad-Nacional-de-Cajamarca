package org.ejercicios;

import java.util.Arrays;

public class Mecanico {
    private String nombre;
    private String apellido;
    private int id_empleado;
    private String especialidad;
    private String telefono_contacto;
    private boolean activo;

    public Mecanico(int id_empleado, String nombre, String apellido, boolean activo, String telefono_contacto, String especialidad) {
        this.telefono_contacto = telefono_contacto;
        this.especialidad = especialidad;
        this.id_empleado = id_empleado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getEspecialidades() {
        return especialidad;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidad = especialidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre=" + nombre +
                ", apellido=" + apellido +
                ", id_empleado=" + id_empleado +
                ", especialidades=" + especialidad +
                ", telefono_contacto=" + telefono_contacto +
                ", activo=" + activo +
                '}';
    }
}


