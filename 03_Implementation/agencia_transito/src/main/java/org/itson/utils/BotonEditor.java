package org.itson.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Optional;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;
import org.itson.dominio.Persona;
import org.itson.presentacion.FrmConsultaBuscarPersona;
import org.itson.presentacion.FrmTramitesPersona;
import org.itson.presentacion.UnitOfWork;

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
    public BotonEditor(final JFrame frame, UnitOfWork unit, JTable tabla) {
        boton = new JButton();
        boton.setFocusPainted(false);
        boton.setText("Trámites");
        boton.setBackground(new Color(102,10,10));
        boton.setForeground(Color.WHITE);
        boton.addActionListener((ActionEvent e) -> {
            int fila = tabla.convertRowIndexToModel(tabla.getEditingRow());
            TableModel model = tabla.getModel();
            String rfc = model.getValueAt(fila, 0).toString();
            Optional<Persona> persona = unit.personasDAO().getByRFC(rfc);
            new FrmTramitesPersona(persona.get(), unit).setVisible(true);
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
