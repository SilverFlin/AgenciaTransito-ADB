package org.itson.excepciones;

/**
 *
 * @author Toled
 */
public class PersistenciaException extends Exception {

    /**
     * Crea la excepción con mensaje personalizado.
     *
     * @param message
     */
    public PersistenciaException(final String message) {
        super(message);
    }

}
