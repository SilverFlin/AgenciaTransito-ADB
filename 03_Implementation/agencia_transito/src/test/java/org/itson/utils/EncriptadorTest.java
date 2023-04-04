package org.itson.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Toled
 */
public class EncriptadorTest {

    /**
     * Configuración de la clase.
     */
    public EncriptadorTest() {
    }

    /**
     * Prueba la validación de un hash.
     */
    @Test
    public void testEncriptarYValidar() {
        System.out.println("encriptar");
        String txt = "SilverFlin1";

        String hash = Encriptador.encriptar(txt);
        boolean result = Encriptador.validar(txt, hash);
        boolean expResult = true;
        assertEquals(expResult, result);
    }

}
