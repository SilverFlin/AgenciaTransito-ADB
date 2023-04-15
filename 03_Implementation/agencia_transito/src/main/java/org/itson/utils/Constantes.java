package org.itson.utils;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public final class Constantes {

    private Constantes() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * Nombre de la unidad de persistancia utilizada en el sistema.
     */
    public static final String PERSISTENCE_UNIT = "agencia_transito";

    /**
     * Tags que se ignoran en el código generado de los JFrame en
     * initComponents.
     */
    public static final String SUPPRESS_ALL_WARNINGS = "all";

}
