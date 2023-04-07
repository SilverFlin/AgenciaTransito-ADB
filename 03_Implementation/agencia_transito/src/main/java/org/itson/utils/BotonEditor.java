/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import org.itson.presentacion.ConsultaBuscarPersona;

/**
 *
 * @author march
 */
public class BotonEditor extends AbstractCellEditor implements TableCellEditor {

    private JButton boton;

    public BotonEditor(JFrame frame) {
        boton = new JButton();
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setText("🔍");
        boton.setBackground(new Color(159, 34, 65));
        boton.setForeground(Color.WHITE);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Buscando");
                new ConsultaBuscarPersona().setVisible(true);
                frame.dispose();
            }
        });
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return boton;
    }

}
