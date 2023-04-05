package org.itson.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Toled
 */
public class ValidacionesTest {

    /**
     * Configuración de clase.
     */
    public ValidacionesTest() {
    }

    /**
     * Test of isNumeric method, of class Validaciones.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "ab";
        boolean expResult = false;
        boolean result = Validaciones.isNumeric(str);
        assertEquals(expResult, result);

        String str2 = "12";
        boolean expResult2 = true;
        boolean result2 = Validaciones.isNumeric(str2);
        assertEquals(expResult2, result2);

    }

}
