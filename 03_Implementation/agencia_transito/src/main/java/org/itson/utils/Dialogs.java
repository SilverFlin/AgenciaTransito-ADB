package org.itson.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public final class Dialogs {

    private Dialogs() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Carga un dialog de error en el componante proporcionado.
     *
     * @param componente
     * @param msg
     */
    public static void mostrarMensajeError(
            final Component componente,
            final String msg
    ) {
        String titulo = "Error";
        JOptionPane.showMessageDialog(
                componente,
                msg,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Carga un dialog de éxito en el componante proporcionado.
     *
     * @param componente
     * @param msg
     */
    public static void mostrarMensajeExito(
            final Component componente,
            final String msg
    ) {
        String titulo = "Éxito";
        JOptionPane.showMessageDialog(
                componente,
                msg,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Carga un dialog de opción si-no en el componente propocionado.
     *
     * Yes: 0 | No: 1 | Cancel: 2 | Close: -1
     *
     * @param componente
     * @param msg
     * @param titulo
     * @return valor de la selección.
     */
    public static int mostrarMensajeYesNoOption(
            final Component componente,
            final String msg,
            final String titulo
    ) {
        return JOptionPane.showConfirmDialog(
                componente,
                msg,
                titulo,
                JOptionPane.YES_NO_OPTION);
    }
}
