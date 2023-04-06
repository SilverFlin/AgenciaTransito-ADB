package org.itson.daos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.FormateadorTelefono;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Toled
 */
public class PersonasDAOImplTest {

    /**
     * Configuración de la clase.
     */
    public PersonasDAOImplTest() {
    }

    /**
     * Se reinicia la base de datos y se agregan registros suficientes para
     * poder realizar las pruebas.
     */
    @BeforeAll
    public static void setUpClass() {
        // TODO(Luis): Correr script base de pruebas.
    }

    /**
     * Test of get method, of class PersonasDAOImpl.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        long id = 1;
        PersonasDAOImpl instance = new PersonasDAOImpl();

        Optional<Persona> result = instance.get(id);
        Assertions.assertTrue(result.isPresent());
    }

    /**
     * Test of getByRFC method, of class PersonasDAOImpl.
     */
    @Test
    public void testGetByRFC() {
        // TODO(Luis): cambiar a uno del script de prueba
        String rfc = "0786560674251";
        PersonasDAOImpl instance = new PersonasDAOImpl();
        Optional<Persona> result = instance.getByRFC(rfc);
        Assertions.assertTrue(result.isPresent());
    }

    /**
     * Test of getByNombre method, of class PersonasDAOImpl.
     */
    @Test
    public void testGetByNombre() {
        System.out.println("getByNombre");
        String nombre = "eda";
        PersonasDAOImpl instance = new PersonasDAOImpl();

        List<Persona> result = instance.getByNombre(nombre);
        Persona personaTest = result.get(0);
        boolean testContieneNombre = personaTest.getNombres().contains(nombre);
        assertTrue(testContieneNombre);
    }

    /**
     * Test of getByAnho method, of class PersonasDAOImpl.
     */
    @Test
    public void testGetByAnho() {
        System.out.println("getByAnho");
        final int anho = 1008;
        PersonasDAOImpl instance = new PersonasDAOImpl();

        List<Persona> result = instance.getByAnho(anho);
        Persona personaTest = result.get(0);
        int testPrimerAnho = personaTest.getFechaNacimiento()
                .get(Calendar.YEAR);

        assertEquals(anho, testPrimerAnho);
    }

    /**
     * Test of getAll method, of class PersonasDAOImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PersonasDAOImpl instance = new PersonasDAOImpl();
        List<Persona> result = instance.getAll();
        boolean contieneAlgo = !result.isEmpty();
        assertTrue(contieneAlgo);
    }

    /**
     * Test of save method, of class PersonasDAOImpl.
     *
     * @throws org.itson.excepciones.PersistenciaException
     */
    @Test
    public void testSave() throws PersistenciaException {
        System.out.println("save");
        PersonasDAOImpl instance = new PersonasDAOImpl();

        Persona persona = new Persona();
        persona.setNombres("Luis");
        persona.setApellidoPaterno("Toledo");
        persona.setRfc("123456789abcd");
        FormateadorTelefono telefono = new FormateadorTelefono("1234567890");
        persona.setTelefono(telefono.getTelefono());
        final int anho = 1950;
        final int mes = 3;
        final int dia = 10;
        Calendar fechaNacimiento = new GregorianCalendar(anho, mes, dia);
        persona.setFechaNacimiento(fechaNacimiento);

        Persona result;
        result = instance.save(persona);
        boolean isIdGenerada = result.getId() != null;
        assertTrue(isIdGenerada);

    }
}
