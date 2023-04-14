package org.itson.utils;

import org.itson.excepciones.EncriptacionException;
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
     *
     * @throws org.itson.excepciones.EncriptacionException
     */
    @Test
    public void testEncriptarYValidar() throws EncriptacionException {
        System.out.println("encriptar");
        String txt = "SilverFlin1";

//        String hash = Encriptador.encriptar(txt);
//        String output = Encriptador.desencriptar(hash);
//        assertEquals(txt, output);
    }

}
