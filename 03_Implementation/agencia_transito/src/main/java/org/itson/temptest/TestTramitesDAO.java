package org.itson.temptest;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.daos.PlacasDAOImpl;
import org.itson.interfaces.DAO;
import org.itson.daos.TramitesDAOImpl;
import org.itson.dominio.Placa;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Tramite;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.PlacasDAO;
import org.itson.interfaces.TramitesDAO;
import static org.itson.temptest.TestPersonasDAO.agregaPersonaFalsa;
import org.itson.utils.GeneradorMatricula;
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
        LOGGER.log(Level.INFO, "\nIngresar Tramite:");
        LOGGER.log(Level.INFO, ingresarPlacaFalso().toString());
        LOGGER.log(Level.INFO, "\nConsultar tramite id=1:");
        LOGGER.log(Level.INFO, consultaPrimerTramite().toString());
    }

    private static List<Tramite> consultaTramites() {
        TramitesDAO tramitesDAO = new TramitesDAOImpl();
        return tramitesDAO.getAll();
    }

    private static Placa ingresarPlacaFalso() {
        PlacasDAO placasDAO = new PlacasDAOImpl();
        Placa placa = new Placa();
        String matricula = GeneradorMatricula.generar();
        placa.setMatricula(matricula);
        final double costo = 100.0;
        placa.setCosto(costo);
        placa.setFechaInicio(new GregorianCalendar());
        placa.setTipo(TipoPlaca.VEHICULO_NUEVO);
        placa.setFechaRecepcion(new GregorianCalendar());
        placa.setTramitante(agregaPersonaFalsa());
        try {
            placa = placasDAO.save(placa);
        } catch (PersistenciaException ex) {
            Logger.getLogger(TestTramitesDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return placa;
    }

    private static Optional<Tramite> consultaPrimerTramite() {
        DAO tramitesDAO = new TramitesDAOImpl();
        return tramitesDAO.get(1);
    }
}
