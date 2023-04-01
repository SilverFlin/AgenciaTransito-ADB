/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

/**
 *
 * @author Toled
 */
public class ValidacionesFormularios {

    public static boolean isLongitudTextoValida(String texto, int limiteInferior, int limiteSuperior) {
        if (limiteInferior >= limiteSuperior) {
            throw new UnsupportedOperationException("Limite inferior debe ser menor");
        }
        // Expresión regular que valida un string de 1 a 100 caracteres
        String regex = "^.{1,100}$";
        // Validar el texto con la expresión regular
        return texto.matches(regex);
    }
}
