package org.itson.temptest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.excepciones.PersistenciaException;

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

    public static void generarRegistros(final int cantidad) {

        final int registrosDiferentes = 2;
        final int vueltas = cantidad / registrosDiferentes;
        for (int i = 0; i < vueltas; i++) {
            try {
                TestTramitesDAO.ingresarLicenciaFalsa();
                TestTramitesDAO.ingresarPlacaFalso();
            } catch (PersistenciaException ex) {
                LOGGER.log(Level.SEVERE, "Error al ingresar registros.");
            }
        }
        String msg = cantidad + " Registros ingresados.";
        LOGGER.log(Level.INFO, msg);
    }
}
