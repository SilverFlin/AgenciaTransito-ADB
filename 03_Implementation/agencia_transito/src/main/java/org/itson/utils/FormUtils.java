/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import javax.swing.JFrame;

/**
 *
 * @author Toled
 */
public class FormUtils {

    public static <T extends JFrame> void cargarForm(T cargar, JFrame actual) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }

    public static void regresar(JFrame frmAnterior, JFrame actual) {
        frmAnterior.setVisible(true);
        actual.setVisible(false);
    }
}
