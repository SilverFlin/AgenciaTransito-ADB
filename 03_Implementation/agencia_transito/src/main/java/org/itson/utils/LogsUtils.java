package org.itson.utils;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public final class LogsUtils {

    /**
     * Logger.
     */
    private static final Logger LOGGER
            = Logger.getLogger(LogsUtils.class.getName());

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
            String msg = obj.toString();
            LOGGER.log(Level.INFO, msg);
        }
    }
}
