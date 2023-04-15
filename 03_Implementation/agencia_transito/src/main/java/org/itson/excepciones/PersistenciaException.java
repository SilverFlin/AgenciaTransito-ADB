package org.itson.excepciones;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class PersistenciaException extends Exception {

    /**
     * Crea la excepción con mensaje personalizado.
     *
     * @param message Mensaje de la excepción
     */
    public PersistenciaException(final String message) {
        super(message);
    }

}
