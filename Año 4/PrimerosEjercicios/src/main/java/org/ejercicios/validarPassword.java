package org.ejercicios;

public class validarPassword {
    private static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";


    public String valida(String clave) {
        if (clave.length() >=14 &&
        clave.matches(REGEX)){
            return ("Contraseña Fuerte :-)");
        }
        return "Contraseña Debil :-(";
    }
}
