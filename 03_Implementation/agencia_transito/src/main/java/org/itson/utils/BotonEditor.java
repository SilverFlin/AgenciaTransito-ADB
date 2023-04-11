package org.itson.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import org.itson.presentacion.FrmConsultaBuscarPersona;

/**
 *
 * @author march
 */
public class BotonEditor extends AbstractCellEditor implements TableCellEditor {

    /**
     * Boton generado.
     */
    private JButton boton;

    /**
     * Constructor principal.
     *
     * @param frame
     */
    public BotonEditor(final JFrame frame) {
        boton = new JButton();
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setText("🔍");
        final int red = 159;
        final int green = 34;
        final int blue = 65;
        boton.setBackground(new Color(red, green, blue));
        boton.setForeground(Color.WHITE);
        boton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Buscando");
            new FrmConsultaBuscarPersona().setVisible(true);
            frame.dispose();
        });
    }

    /**
     * No se necesita.
     *
     * @return null
     */
    @Override
    public Object getCellEditorValue() {
        return null;
    }

    /**
     * Regresa el boton generado, hace falta cambiar.
     *
     * @param table
     * @param value
     * @param isSelected
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component getTableCellEditorComponent(
            final JTable table,
            final Object value,
            final boolean isSelected,
            final int row,
            final int column
    ) {
        return boton;
    }

}
