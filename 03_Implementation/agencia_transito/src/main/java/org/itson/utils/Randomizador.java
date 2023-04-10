package org.itson.utils;

import java.util.Random;

/**
 *
 * @author Toled
 */
public final class Randomizador {

    /**
     * Base que usa el randomizador para números.
     */
    private static final int BASE_DECIMALES = 10;

    /**
     * Base que usa el randomizador para letras.
     */
    private static final int BASE_LETRAS = 26;

    /**
     * Clase necesaria para generar el número aleatorio.
     */
    private static final Random RAND = new Random();

    private Randomizador() {
        throw new IllegalStateException("Utility class");
    }

    /**
     *
     * @param digCount
     * @return Numero aleatorio generado en string.
     */
    public static String getRandomStringNumber(final int digCount) {
        StringBuilder sb = new StringBuilder(digCount);

        for (int i = 0; i < digCount; i++) {
            sb.append((char) ('0' + RAND.nextInt(BASE_DECIMALES)));
        }
        return sb.toString();
    }

    /**
     *
     * @param max
     * @return Integer aleatorio entre 0 y max.
     */
    public static Integer getRandomNumber(final int max) {
        return RAND.nextInt(max);
    }

    /**
     *
     * @param charCount
     * @return Letras aleatorias generadas
     */
    public static String getRandomLetras(final int charCount) {
        StringBuilder sb = new StringBuilder(charCount);

        for (int i = 0; i < charCount; i++) {
            char letra = (char) (RAND.nextInt(BASE_LETRAS) + 'A');
            sb.append(letra);
        }
        return sb.toString();
    }

}
