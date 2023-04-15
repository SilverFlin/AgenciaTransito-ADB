package org.itson.utils;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class FormUtils {

    private FormUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Agarra el item seleccionado y lo regresa en String.
     *
     * @param cbox la combobox
     * @return Texto del item seleccionado.
     */
    public static String getItemComboBox(final JComboBox<String> cbox) {
        return cbox.getItemAt(cbox.getSelectedIndex());
    }

    /**
     *
     * @param componente componente donde se pondrá el dialog.
     * @param titulo titulo del dialog.
     * @param texto contenido del dialog.
     * @return Input ingresado
     */
    public static String pedirInputUsuario(
            final Component componente,
            final String titulo,
            final String texto
    ) {
        return JOptionPane
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
     * @param <T> subclase del JFrame actual.
     * @param cargar el frame a cargar.
     * @param actual el frame actual.
     * @throws InstantiationError InstantiationError.
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
     * @param frmAnterior frame anterior.
     * @param actual frame actual.
     */
    public static void regresar(
            final JFrame actual,
            final JFrame frmAnterior
    ) {
        cargarForm(frmAnterior, actual);
    }
}
