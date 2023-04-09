package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramitePlacasConfirmacion extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramitePlacasConfirmacion.class.getName());

    public TramitePlacasConfirmacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCantidadCosto = new javax.swing.JLabel();
        lblNombres5 = new javax.swing.JLabel();
        lblNombres7 = new javax.swing.JLabel();
        lblNombres8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblAnho = new javax.swing.JLabel();
        lblNombres10 = new javax.swing.JLabel();
        lblNombres11 = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        lblNombres15 = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(173, 139, 106));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(147, 17, 17));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 28)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Trámite Placas");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(102, 10, 10));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.setBorderPainted(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 40));

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        btnAceptar.setBackground(new java.awt.Color(121, 90, 59));
        btnAceptar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        Background.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 30));

        btnCancelar.setBackground(new java.awt.Color(121, 90, 59));
        btnCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 30));

        lblCantidadCosto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblCantidadCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadCosto.setText("$Cantidad");
        Background.add(lblCantidadCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 110, 20));

        lblNombres5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres5.setText("Perteneciente a:");
        Background.add(lblNombres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, 20));

        lblNombres7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres7.setText("Placas para el automóvil con serie:");
        Background.add(lblNombres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, 20));

        lblNombres8.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres8.setText("Costo:");
        Background.add(lblNombres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 70, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 170, 10));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 500, 10));

        lblAnho.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblAnho.setForeground(new java.awt.Color(255, 255, 255));
        lblAnho.setText("\"año\"");
        Background.add(lblAnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, 20));

        lblNombres10.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres10.setText("Marca:");
        Background.add(lblNombres10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 60, 20));

        lblNombres11.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres11.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres11.setText("Línea:");
        Background.add(lblNombres11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, 20));

        lblSerie.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblSerie.setText("\"serie\"");
        Background.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 150, 20));

        lblMarca.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("\"marca\"");
        Background.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 20));

        lblLinea.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblLinea.setText("\"línea\"");
        Background.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 20));

        lblNombres15.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres15.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres15.setText("Modelo:");
        Background.add(lblNombres15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, 20));

        lblNombreCompleto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCompleto.setText("\"nombres, apellidopa, apellidoma\"");
        Background.add(lblNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 330, 20));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAnho;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCantidadCosto;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombres10;
    private javax.swing.JLabel lblNombres11;
    private javax.swing.JLabel lblNombres15;
    private javax.swing.JLabel lblNombres5;
    private javax.swing.JLabel lblNombres7;
    private javax.swing.JLabel lblNombres8;
    private javax.swing.JLabel lblSerie;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
