package org.itson.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.presentacion.MenuPrincipal;
import static org.itson.temptest.TestPersonasDAO.probarPersonasDAO;
import static org.itson.temptest.TestTramitesDAO.probarTramitesDAO;
import static org.itson.temptest.TestVehiculosDAO.probarVehiculosDAO;

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
        iniciar();
    }

    /**
     * Método temporal para probar DAOs, se debe reemplazar con el uso de un
     * script para ingresar datos.
     */
    private static void probarDAOS() {
        probarPersonasDAO();
        probarTramitesDAO();
        probarVehiculosDAO();
    }

    private static void iniciar() {
        LOGGER.log(Level.INFO, "Iniciando App");
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }

}
