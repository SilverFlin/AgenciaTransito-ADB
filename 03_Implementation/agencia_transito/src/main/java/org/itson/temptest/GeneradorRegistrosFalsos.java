package org.itson.temptest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toled
 */
public class GeneradorRegistrosFalsos {

    /**
     * Logger.
     */
    private static final Logger LOGGER
            = Logger.getLogger(GeneradorRegistrosFalsos.class.getName());

    private GeneradorRegistrosFalsos() {
        throw new IllegalStateException("Utility class");
    }

    static public void generarRegistros(final int cantidad) {

        final int registrosDiferentes = 2;
        final int vueltas = cantidad / registrosDiferentes;
        for (int i = 0; i < vueltas; i++) {
            TestTramitesDAO.ingresarLicenciaFalsa();
            TestTramitesDAO.ingresarPlacaFalso();
        }
        String msg = cantidad + " Registros ingresados.";
        LOGGER.log(Level.INFO, msg);
    }
}
