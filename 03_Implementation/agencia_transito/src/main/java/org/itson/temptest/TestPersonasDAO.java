package org.itson.temptest;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.interfaces.DAO;
import org.itson.daos.PersonasDAOImpl;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import static org.itson.utils.LogsUtils.imprimirLista;
import static org.itson.utils.Randomizador.getRandomStringNumber;

/**
 *
 * @author Toled
 */
public final class TestPersonasDAO {

    // TODO Mover a Prueba Unitaria
    /**
     * Logger.
     */
    private static final Logger LOGGER
            = Logger.getLogger(TestPersonasDAO.class.getName());

    private TestPersonasDAO() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Prueba el agregar y consultar de PersonasDAO.
     */
    public static void probarPersonasDAO() {
        LOGGER.log(Level.INFO, "Agregar Persona falsa:");
        agregaPersonaFalsa();
        LOGGER.log(Level.INFO, "\nConsultar Personas");
        imprimirLista(consultaPersonas());
        LOGGER.log(Level.INFO, "\nConsultar persona id=1:");
        LOGGER.log(Level.INFO, consultaPrimerPersona().toString());
    }

    /**
     * Persiste una persona falsa con fines de pruebas y la regresa.
     *
     * @return La persona guardada.
     */
    public static Persona agregaPersonaFalsa() {
        Persona persona = crearPersonaFalsa();
        DAO personasDAO = new PersonasDAOImpl();
        try {
            return (Persona) personasDAO.save(persona);
        } catch (PersistenciaException ex) {
            LOGGER.log(Level.INFO, ex.getMessage());
            return null;
        }
    }

    /**
     * Crea una persona falsa y la regresa.
     *
     * @return la persona.
     */
    public static Persona crearPersonaFalsa() {
        Persona persona = new Persona();
        persona.setNombres("Jedal");
        persona.setApellidoPaterno("Lestibournes");
        persona.setApellidoMaterno("The TinEye");

        final int anhoPrueba = 1007;
        final int mesPrueba = 11;
        final int diaPrueba = 6;
        persona.setFechaNacimiento(
                new GregorianCalendar(anhoPrueba, mesPrueba, diaPrueba)
        );
        final int longitudRfc = 13;
        persona.setRfc(getRandomStringNumber(longitudRfc));
        persona.setTelefono("123123123");

        return persona;
    }

    private static Optional<Persona> consultaPrimerPersona() {
        DAO personasDAO = new PersonasDAOImpl();
        return personasDAO.get(1);
    }

    private static List<Persona> consultaPersonas() {
        DAO personasDAO = new PersonasDAOImpl();
        return personasDAO.getAll();
    }
}
