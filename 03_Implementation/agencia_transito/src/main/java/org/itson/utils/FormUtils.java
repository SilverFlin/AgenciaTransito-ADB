package org.itson.utils;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Toled
 */
public final class FormUtils {

    private FormUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Agarra el item seleccionado y lo regresa en String.
     *
     * @param cbox
     * @return Texto del item seleccionado.
     */
    public static String getItemComboBox(final JComboBox<String> cbox) {
        return cbox.getItemAt(cbox.getSelectedIndex());
    }

    /**
     *
     * @param componente
     * @param titulo
     * @param texto
     * @return Input ingresado
     */
    public static String pedirInputUsuario(
            final Component componente,
            final String titulo,
            final String texto
    ) {
        return (String) JOptionPane
                .showInputDialog(
                        componente,
                        texto,
                        titulo,
                        JOptionPane.QUESTION_MESSAGE
                );
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
