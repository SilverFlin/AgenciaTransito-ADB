package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramiteLicenciaConfirmacion extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramiteLicenciaConfirmacion.class.getName());

    public TramiteLicenciaConfirmacion() {
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
        btnRegistrarAutomovil = new javax.swing.JButton();
        btnRegistrarAutomovil1 = new javax.swing.JButton();
        lblNombres = new javax.swing.JLabel();
        lblNombres3 = new javax.swing.JLabel();
        lblNombres4 = new javax.swing.JLabel();
        lblNombres5 = new javax.swing.JLabel();
        lblNombres6 = new javax.swing.JLabel();
        lblNombres7 = new javax.swing.JLabel();
        lblNombres8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

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
        lblBienvenido.setText("Trámite Licencia");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

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

        btnRegistrarAutomovil.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarAutomovil.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnRegistrarAutomovil.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutomovil.setText("Aceptar");
        btnRegistrarAutomovil.setBorder(null);
        btnRegistrarAutomovil.setBorderPainted(false);
        btnRegistrarAutomovil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovilActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, 30));

        btnRegistrarAutomovil1.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarAutomovil1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnRegistrarAutomovil1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutomovil1.setText("Cancelar");
        btnRegistrarAutomovil1.setBorder(null);
        btnRegistrarAutomovil1.setBorderPainted(false);
        btnRegistrarAutomovil1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovil1ActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 100, 30));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres.setText("\"nombres, apellidopa, apellidoma\"");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 310, 20));

        lblNombres3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres3.setText("No.");
        Background.add(lblNombres3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 20));

        lblNombres4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres4.setText("$Cantidad");
        Background.add(lblNombres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 110, 20));

        lblNombres5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres5.setText("año(s).");
        Background.add(lblNombres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 20));

        lblNombres6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres6.setText("con la duración de");
        Background.add(lblNombres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 20));

        lblNombres7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres7.setText("Licencia para la persona:");
        Background.add(lblNombres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 20));

        lblNombres8.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres8.setText("Costo:");
        Background.add(lblNombres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 10));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 500, 10));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutomovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarAutomovilActionPerformed

    private void btnRegistrarAutomovil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutomovil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarAutomovil1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrarAutomovil;
    private javax.swing.JButton btnRegistrarAutomovil1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombres3;
    private javax.swing.JLabel lblNombres4;
    private javax.swing.JLabel lblNombres5;
    private javax.swing.JLabel lblNombres6;
    private javax.swing.JLabel lblNombres7;
    private javax.swing.JLabel lblNombres8;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
