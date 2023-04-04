package org.itson.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Toled
 */
public class FormateadorTelefonoTest {

    /**
     * Configuración de clase.
     */
    public FormateadorTelefonoTest() {
    }

    /**
     * Prueba de la generación del formato.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        FormateadorTelefono instance = new FormateadorTelefono("1234567890");
        String expResult = "(12) 3456 7890";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Prueba de excepción para teléfonos que incluyen caracteres inválidos.
     */
    @Test
    public void testGetTelefonoLetras() {
        System.out.println("getTelefono letras");
        IllegalArgumentException thrown;
        thrown = assertThrows(IllegalArgumentException.class, () -> {
            new FormateadorTelefono("123456789a");
        });

        assertEquals("Teléfono debe tener solo dígitos", thrown.getMessage());
    }

    /**
     * Prueba de excepción para teléfonos que no tienen longitud esperada.
     */
    @Test
    public void testGetTelefonoLongitud() {
        System.out.println("getTelefono letras");
        IllegalArgumentException thrown;
        thrown = assertThrows(IllegalArgumentException.class, () -> {
            new FormateadorTelefono("1234567");
        });

        assertEquals("Teléfono debe tener 10 caracteres", thrown.getMessage());
    }

}
