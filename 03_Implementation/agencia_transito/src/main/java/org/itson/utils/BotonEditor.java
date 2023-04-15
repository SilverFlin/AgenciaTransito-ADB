package org.itson.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Optional;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;
import org.itson.dominio.Persona;
import org.itson.presentacion.FrmTramitesPersona;
import org.itson.presentacion.UnitOfWork;
import static org.itson.utils.FormUtils.cargarForm;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class BotonEditor extends AbstractCellEditor implements TableCellEditor {

    /**
     * Boton generado.
     */
    private JButton boton;

    /**
     * Constructor principal.
     *
     * @param frame Frame donde se encuentra la tabla.
     * @param unit Objeto para utilizar DAOS.
     * @param tabla Tabla donde se pondrá el botón.
     */
    public BotonEditor(
            final JFrame frame,
            final UnitOfWork unit,
            final JTable tabla
    ) {
        boton = new JButton();
        boton.setFocusPainted(false);
        boton.setText("Trámites");
        final int r = 102;
        final int g = 10;
        final int b = 10;
        boton.setBackground(new Color(r, g, b));
        boton.setForeground(Color.WHITE);
        boton.addActionListener((ActionEvent e) -> {
            int fila = tabla.convertRowIndexToModel(tabla.getEditingRow());
            TableModel model = tabla.getModel();
            String rfc = model.getValueAt(fila, 0).toString();
            Optional<Persona> persona = unit.personasDAO().getByRFC(rfc);
            System.out.println(rfc);
            cargarForm(new FrmTramitesPersona(persona.get(), unit), frame);
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
     * Regresa el boton generado.
     *
     * @param table Tabla donde se pondrá el botón.
     * @param value Valor del objeto.
     * @param isSelected Atributo para saber si fue seleccionado.
     * @param row Fila donde se pondrá.
     * @param column Columna donde se pondrá.
     * @return Botón generado.
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
