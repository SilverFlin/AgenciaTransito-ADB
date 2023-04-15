/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Luis Toledo & Misael Marchena
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
        boton.setBackground(new Color(102, 10, 10));
        boton.setForeground(Color.WHITE);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return boton;
    }

}
