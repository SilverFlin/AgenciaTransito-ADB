package org.itson.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.excepciones.PersistenciaException;
import org.itson.presentacion.FrmMenuPrincipal;
import static org.itson.temptest.TestPersonasDAO.probarPersonasDAO;
import static org.itson.temptest.TestTramitesDAO.probarTramitesDAO;
import static org.itson.temptest.TestVehiculosDAO.probarVehiculosDAO;

/**
 *
 * @author Luis Toledo & Misael Marchena
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
//        GeneradorRegistrosFalsos.generarRegistros(50);
        iniciar();
        
    }

    /**
     * Método temporal para probar DAOs, se debe reemplazar con el uso de un
     * script para ingresar datos.
     *
     * @throws PersistenciaException
     */
    private static void probarDAOS() throws PersistenciaException {
        probarPersonasDAO();
        probarTramitesDAO();
        probarVehiculosDAO();
    }

    private static void iniciar() {
        LOGGER.log(Level.INFO, "Iniciando App");
        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.setVisible(true);
    }

}
