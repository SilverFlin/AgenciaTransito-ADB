/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import java.util.List;

/**
 *
 * @author Toled
 */
public class LogsUtils {

    private LogsUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     *
     * @param <T>
     * @param lista
     */
    public static <T> void imprimirLista(final List<T> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
