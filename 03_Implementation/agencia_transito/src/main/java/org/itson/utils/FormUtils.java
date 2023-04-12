package org.itson.utils;

import javax.swing.JFrame;

/**
 *
 * @author Toled
 */
public final class FormUtils {

    private FormUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Carga un form y oculta el actual.
     *
     * @param <T>
     * @param cargar
     * @param actual
     * @throws InstantiationError
     */
    public static <T extends JFrame> void cargarForm(
            final T cargar,
            final JFrame actual
    ) throws InstantiationError {

        if (cargar == null || actual == null) {
            throw new InstantiationError("Form no instanciado");
        }
        actual.setVisible(false);
        cargar.setVisible(true);

    }

    /**
     * Regresa un a un form anterior, ocultando el actual.
     *
     * @param frmAnterior
     * @param actual
     */
    public static void regresar(
            final JFrame actual,
            final JFrame frmAnterior
    ) {
        cargarForm(frmAnterior, actual);
    }
}
