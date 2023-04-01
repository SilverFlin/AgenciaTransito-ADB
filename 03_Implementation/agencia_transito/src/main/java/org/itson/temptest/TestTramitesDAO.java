package org.itson.temptest;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.interfaces.DAO;
import org.itson.daos.TramitesDAOImpl;
import org.itson.dominio.Tramite;
import static org.itson.utils.LogsUtils.imprimirLista;

/**
 *
 * @author Toled
 */
public final class TestTramitesDAO {

    // TODO Mover a Prueba Unitaria
    /**
     * Logger.
     */
    private static final Logger LOGGER
            = Logger.getLogger(TestTramitesDAO.class.getName());

    private TestTramitesDAO() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Prueba el agregar y consultar de TramitesDAO.
     */
    public static void probarTramitesDAO() {
        LOGGER.log(Level.INFO, "\nConsultar Tramites");
        imprimirLista(consultaTramites());
        LOGGER.log(Level.INFO, "\nConsultar tramite id=1:");
        LOGGER.log(Level.INFO, consultaPrimerTramite().toString());
    }

    private static List<Tramite> consultaTramites() {
        DAO tramitesDAO = new TramitesDAOImpl();
        return tramitesDAO.getAll();
    }

    private static Optional<Tramite> consultaPrimerTramite() {
        DAO tramitesDAO = new TramitesDAOImpl();
        return tramitesDAO.get(1);
    }
}
