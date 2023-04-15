package org.itson.utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class BotonRender implements TableCellRenderer {

    /**
     * Botón que se pondrá en la tabla.
     */
    private JButton boton;

    /**
     * Método constructor que inicializa el botón, establece el texto, color y
     * color de fondo.
     */
    public BotonRender() {
        boton = new JButton();
        boton.setText("Trámites");
        final int r = 102;
        final int g = 10;
        final int b = 10;
        boton.setBackground(new Color(r, g, b));
        boton.setForeground(Color.WHITE);
    }

    /**
     * Regresa el botón generado.
     *
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component getTableCellRendererComponent(
            final JTable table,
            final Object value,
            final boolean isSelected,
            final boolean hasFocus,
            final int row,
            final int column) {
        return boton;
    }

}
