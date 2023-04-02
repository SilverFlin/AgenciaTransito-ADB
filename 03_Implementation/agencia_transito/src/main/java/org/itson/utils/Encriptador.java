package org.itson.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;
import at.favre.lib.crypto.bcrypt.BCrypt.Result;
import at.favre.lib.crypto.bcrypt.BCrypt.Verifyer;

/**
 *
 * @author Toled
 */
public final class Encriptador {

    /**
     * Valor de encriptación recomendado por BCrypt.
     */
    private static final int COST = 12;

    private Encriptador() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Encripta un texto y regresa su hash generado.
     *
     * @param txt
     * @return El hash del texto encriptado.
     */
    public static String encriptar(final String txt) {
        return BCrypt.withDefaults().hashToString(COST, txt.toCharArray());
    }

    /**
     * Compara un texto con un texto encriptado, regresando si coinciden.
     *
     * @param intento
     * @param hashedPassword
     * @return verdadero si el intento coincide con el hash.
     */
    public static boolean validar(
            final String intento,
            final String hashedPassword
    ) {
        Verifyer verifyer = BCrypt.verifyer();
        Result result = verifyer.verify(intento.toCharArray(), hashedPassword);

        return result.verified;
    }
}
