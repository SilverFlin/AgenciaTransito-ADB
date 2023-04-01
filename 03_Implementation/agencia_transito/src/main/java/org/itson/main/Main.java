package org.itson.main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toled
 */
final class Main {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Inicia el sistema.
     *
     * @param args
     */
    public static void main(final String[] args) {
        LOGGER.log(Level.INFO, "Iniciando App");
    }

}
