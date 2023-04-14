package org.itson.temptest;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.daos.LicenciasDAOImpl;
import org.itson.daos.PlacasDAOImpl;
import org.itson.interfaces.DAO;
import org.itson.daos.TramitesDAOImpl;
import org.itson.dominio.EstadoPlaca;
import org.itson.dominio.Licencia;
import org.itson.dominio.Placa;
import org.itson.dominio.TipoLicencia;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Tramite;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.LicenciasDAO;
import org.itson.interfaces.PlacasDAO;
import org.itson.interfaces.TramitesDAO;
import static org.itson.temptest.TestPersonasDAO.agregaPersonaFalsa;
import org.itson.utils.GeneradorMatricula;
import static org.itson.utils.LogsUtils.imprimirLista;
import org.itson.utils.Randomizador;

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
     *
     * @throws org.itson.excepciones.PersistenciaException
     */
    public static void probarTramitesDAO() throws PersistenciaException {
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

    /**
     * Crea una placa y la persiste.
     *
     * @return La placa persistida.
     * @throws PersistenciaException
     */
    public static Placa ingresarPlacaFalso() throws PersistenciaException {
        PlacasDAO placasDAO = new PlacasDAOImpl();
        Placa placa = new Placa();
        String matricula = GeneradorMatricula.generar();
        placa.setMatricula(matricula);
        final int tamanhoRandom = 100;
        final double costo = (Math.random() * tamanhoRandom) + 1;
        placa.setCosto(costo);
        placa.setFechaInicio(generarFechaFalsa());
        placa.setTipo(TipoPlaca.VEHICULO_NUEVO);
        placa.setFechaRecepcion(new GregorianCalendar());
        placa.setTramitante(agregaPersonaFalsa());
        placa.setEstado(EstadoPlaca.ACTIVADA);
        try {
            placa = placasDAO.save(placa);
        } catch (PersistenciaException ex) {
            Logger.getLogger(TestTramitesDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return placa;
    }

    /**
     * Crea una licencia y la persiste.
     *
     * @return La licencia persistida.
     * @throws PersistenciaException
     */
    public static Licencia ingresarLicenciaFalsa()
            throws PersistenciaException {
        LicenciasDAO licenciasDAO = new LicenciasDAOImpl();
        Licencia licencia = new Licencia();
        final int tamanhoRandom = 100;
        final double costo = (Math.random() * tamanhoRandom) + 1;
        licencia.setCosto(costo);
        licencia.setFechaInicio(generarFechaFalsa());
        licencia.setTipo(TipoLicencia.DISCAPACITADO);
        licencia.setFechaCaducidad(new GregorianCalendar());
        licencia.setTramitante(agregaPersonaFalsa());
        licencia.setAnhosVigencia(2);
        try {
            licencia = licenciasDAO.save(licencia);
        } catch (PersistenciaException ex) {
            Logger.getLogger(TestTramitesDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return licencia;
    }

    private static Optional<Tramite> consultaPrimerTramite() {
        DAO tramitesDAO = new TramitesDAOImpl();
        return tramitesDAO.get(1);
    }

    private static Calendar generarFechaFalsa() {

        final int limiteAnho = 2000;
        final int year = Randomizador.getRandomNumber(limiteAnho);
        final int limiteMes = 12;
        final int mes = Randomizador.getRandomNumber(limiteMes);
        final int limiteDia = 28;
        final int dia = Randomizador.getRandomNumber(limiteDia);

        return new GregorianCalendar(year, mes, dia);
    }

}
