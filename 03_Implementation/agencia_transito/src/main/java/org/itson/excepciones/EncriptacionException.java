package org.itson.excepciones;

/**
 *
 * @author Toled
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
