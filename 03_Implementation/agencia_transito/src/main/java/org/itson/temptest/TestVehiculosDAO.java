package org.itson.temptest;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.daos.VehiculosDAOImpl;
import org.itson.dominio.Automovil;
import org.itson.dominio.Vehiculo;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.VehiculosDAO;
import static org.itson.temptest.TestPersonasDAO.crearPersonaFalsa;
import static org.itson.utils.LogsUtils.imprimirLista;
import static org.itson.utils.Randomizador.getRandomStringNumber;

/**
 *
 * @author Toled
 */
public final class TestVehiculosDAO {

    // TODO Mover a Prueba Unitaria
    /**
     * Logger.
     */
    private static final Logger LOGGER
            = Logger.getLogger(TestVehiculosDAO.class.getName());

    private TestVehiculosDAO() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Prueba el agregar y consultar de TramitesDAO.
     */
    public static void probarVehiculosDAO() {
        LOGGER.log(Level.INFO, "Agregar Vehiculo falso:");
        agregaVehiculoFalso();
        LOGGER.log(Level.INFO, "\nConsultar Vehiculos");
        imprimirLista(consultaVehiculos());
        LOGGER.log(Level.INFO, "\nConsultar vehiculo id=1:");
        LOGGER.log(Level.INFO, consultaPrimerVehiculo().toString());
    }

    private static String getRandomNoSerie() {
        final int longitudNoSerie = 17;
        return getRandomStringNumber(longitudNoSerie);
    }

    private static Vehiculo agregaVehiculoFalso() {

        Vehiculo vehiculo = crearVehiculoFalso();
        VehiculosDAO vehiculosDAO = new VehiculosDAOImpl();
        try {
            return (Vehiculo) vehiculosDAO.save(vehiculo);
        } catch (PersistenciaException ex) {
            LOGGER.log(Level.WARNING, ex.getMessage());
            return null;
        }

    }

    private static Vehiculo crearVehiculoFalso() {
        Vehiculo automovil = new Automovil();
        automovil.setColor("Azul");
        automovil.setLinea("Linea");
        automovil.setMarca("Marca");
        automovil.setModelo("Modelo");
        automovil.setNumeroSerie(getRandomNoSerie());
        automovil.setDuenho(crearPersonaFalsa());

        return automovil;
    }

    private static List<Vehiculo> consultaVehiculos() {
        VehiculosDAO vehiculosDAO = new VehiculosDAOImpl();
        return vehiculosDAO.getAll();
    }

    private static Optional<Vehiculo> consultaPrimerVehiculo() {
        VehiculosDAO vehiculosDAO = new VehiculosDAOImpl();
        return vehiculosDAO.get(1);
    }

}
