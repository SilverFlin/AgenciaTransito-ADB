package org.itson.utils;

import static org.itson.utils.ValidacionesFormularios.isLongitudTextoValida;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Toled
 */
public class ValidacionesFormulariosTest {

    /**
     * Configuración de clase.
     */
    public ValidacionesFormulariosTest() {
    }

    /**
     * Valida el método de longitud de texto con lim inferior y superior.
     */
    @Test
    public void testIsLongitudTextoValida3args() {
        System.out.println("isLongitudTextoValida");
        String texto = "12345";
        final int limInferior = 1;
        final int limtSuperior = 6;
        boolean expResult = true;
        boolean result
                = isLongitudTextoValida(texto, limInferior, limtSuperior);
        assertEquals(expResult, result);

        String texto2 = "12345";
        final int limInferior2 = 1;
        final int limSuperior2 = 3;
        boolean expResult2 = false;
        boolean result2
                = isLongitudTextoValida(texto2, limInferior2, limSuperior2);
        assertEquals(expResult2, result2);

    }

    /**
     * Valida el método de longitud de texto con lim superior.
     */
    @Test
    public void testIsLongitudTextoValidaLimSuperior() {
        System.out.println("isLongitudTextoValida");
        String texto = "123";
        final int limiteSuperior = 3;
        boolean expResult = true;
        boolean result = isLongitudTextoValida(texto, limiteSuperior);
        assertEquals(expResult, result);

        System.out.println("isLongitudTextoValida");
        String texto2 = "123";
        final int limiteSuperior2 = 2;
        boolean expResult2 = false;
        boolean result2 = isLongitudTextoValida(texto2, limiteSuperior2);
        assertEquals(expResult2, result2);
    }

    /**
     * Valida el la exepción de que el limt inferior debe ser menor al superior.
     */
    @Test
    public void testIsLongitudTextoValidaErrorLimInferior() {
        System.out.println("isLongitudTextoValida Error Lim Inferior");
        UnsupportedOperationException thrown;
        thrown = assertThrows(UnsupportedOperationException.class, () -> {
            final int limInferior = 5;
            final int limSuperior = 3;
            isLongitudTextoValida("aaa", limInferior, limSuperior);
        });
        String expMsg = "Limite inferior debe ser menor al superior.";
        assertEquals(expMsg, thrown.getMessage());
    }

    /**
     * Valida el la exepción de que el limt inferior debe ser mayor a 0.
     */
    @Test
    public void testIsLongitudTextoValidaErrorLimZero() {
        System.out.println("isLongitudTextoValida Error Lim Inferior");
        UnsupportedOperationException thrown;
        thrown = assertThrows(UnsupportedOperationException.class, () -> {
            final int limInferior = 0;
            final int limSuperior = 3;
            isLongitudTextoValida("aaa", limInferior, limSuperior);
        });
        String expMsg = "Limite inferior debe ser al menos uno.";
        assertEquals(expMsg, thrown.getMessage());
    }

}
