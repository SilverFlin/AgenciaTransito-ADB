package org.itson.excepciones;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class EncriptacionException extends Exception {

    /**
     * Constructor por defecto.
     */
    public EncriptacionException() {
    }

    /**
     * Crea la excepción con mensaje personalizado.
     *
     * @param message Mensaje de la excepción
     */
    public EncriptacionException(final String message) {
        super(message);
    }

    /**
     * Crea la excepción con mensaje personalizado y causa.
     *
     * @param message Mensaje de la excepción
     * @param cause Causa de la excepción
     */
    public EncriptacionException(final String message, Throwable cause) {
        super(message, cause);
    }

}
