/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import java.util.Random;

/**
 *
 * @author Toled
 */
public class Randomizador {

    static final int BASE10 = 10;
    private static final Random RAND = new Random();

    private Randomizador() {
        throw new IllegalStateException("Utility class");
    }

    /**
     *
     * @param digCount
     * @return Numero aleatorio generado
     */
    public static String getRandomNumber(final int digCount) {
        StringBuilder sb = new StringBuilder(digCount);

        for (int i = 0; i < digCount; i++) {
            sb.append((char) ('0' + RAND.nextInt(BASE10)));
        }
        return sb.toString();
    }

}
