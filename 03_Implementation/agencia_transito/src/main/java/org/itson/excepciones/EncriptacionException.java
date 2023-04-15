package org.itson.excepciones;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class EncriptacionException extends Exception {

    public EncriptacionException() {
    }

    public EncriptacionException(final String message) {
        super(message);
    }

    public EncriptacionException(final String message, Throwable cause) {
        super(message, cause);
    }

}
