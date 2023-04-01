/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

/**
 *
 * @author Toled
 */
public class FormateadorTelefono {

    private String telefono;

    public FormateadorTelefono(String telefono) {
        this.validarFormato(telefono);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono.substring(0, 2) 
                + " " + this.telefono.substring(2,6)
                + " " + this.telefono.substring(6,10);
    }

    private void validarFormato(String telefono) {
        if (telefono.length() != 10) {
            throw new IllegalArgumentException("Teléfono debe tener 10 caracteres");
        }
        if(!Validaciones.isNumeric(telefono)){
            throw new IllegalArgumentException("Teléfono debe tener solo dígitos");
        }
    }

    @Override
    public String toString() {
        return getTelefono();
    }

}
