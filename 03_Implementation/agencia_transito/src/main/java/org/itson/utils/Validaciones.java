package org.itson.utils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class Validaciones {

    private Validaciones() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Valida si un texto contiene solo números.
     *
     * @param str numero a evaluar
     * @return Verdadero si el texto es numérico.
     */
    public static boolean isNumeric(final String str) {
        return str.matches("\\d+(\\d+)?");
    }
}
