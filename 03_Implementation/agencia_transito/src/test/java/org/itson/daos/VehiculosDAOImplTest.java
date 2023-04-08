package org.itson.daos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import org.itson.dominio.Automovil;
import org.itson.dominio.Persona;
import org.itson.dominio.Placa;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Vehiculo;
import org.itson.utils.GeneradorMatricula;
import org.itson.utils.Randomizador;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Toled
 */
public class VehiculosDAOImplTest {

    /**
     * Configuración de la clase.
     */
    public VehiculosDAOImplTest() {
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
     * Test of get method, of class VehiculosDAOImpl. Se asume al menos un
     * registro en la base de datos.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        long id = 1;
        VehiculosDAOImpl instance = new VehiculosDAOImpl();

        Optional<Vehiculo> result = instance.get(id);
        assertTrue(result.isPresent());
    }

    /**
     * Test of getByMatricula method, of class VehiculosDAOImpl.
     */
    @Test
    public void testGetByMatricula() {
        System.out.println("getByMatricula");
        // TODO(Luis): cambiar a uno del script de prueba
        String matricula = "ABC-123";
        VehiculosDAOImpl instance = new VehiculosDAOImpl();
        Optional<Vehiculo> result = instance.getByMatricula(matricula);
        assertTrue(result.isPresent());
    }

    /**
     * Test of getAll method, of class VehiculosDAOImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        VehiculosDAOImpl instance = new VehiculosDAOImpl();
        List<Vehiculo> result = instance.getAll();
        boolean contieneAlgo = !result.isEmpty();
        assertTrue(contieneAlgo);
    }

    /**
     * Test of save method, of class VehiculosDAOImpl.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        VehiculosDAOImpl instance = new VehiculosDAOImpl();

        Vehiculo vehiculo = new Automovil();
        vehiculo.setColor("Azul");
        vehiculo.setLinea("Aveo");
        vehiculo.setMarca("Chevrolet");
        vehiculo.setModelo("2019");
        vehiculo.setNumeroSerie("12312312");

        Persona duenho = new Persona();
        duenho.setNombres("Luis");
        duenho.setApellidoPaterno("Toledo");
        final int cantidadRfcFalso = 13;
        duenho.setRfc(Randomizador.getRandomLetras(cantidadRfcFalso));

        duenho.setTelefono("1234567890");
        final int anho = 1950;
        final int mes = 3;
        final int dia = 10;
        Calendar fechaNacimiento = new GregorianCalendar(anho, mes, dia);
        duenho.setFechaNacimiento(fechaNacimiento);

        Placa placa = new Placa();
        placa.setCosto(1.0);
        placa.setFechaInicio(new GregorianCalendar());
        placa.setFechaRecepcion(new GregorianCalendar());
        placa.setMatricula(GeneradorMatricula.generar());
        placa.setTipo(TipoPlaca.VEHICULO_NUEVO);
        placa.setTramitante(duenho);

        vehiculo.setPlaca(placa);
        vehiculo.setDuenho(duenho);

        Vehiculo result = instance.save(vehiculo);
        boolean isIdGenerada = result.getId() != null;
        assertTrue(isIdGenerada);
    }

}
