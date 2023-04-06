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
        btnRegistrarAutomovil = new javax.swing.JButton();
        btnRegistrarAutomovil1 = new javax.swing.JButton();
        lblNombres4 = new javax.swing.JLabel();
        lblNombres5 = new javax.swing.JLabel();
        lblNombres7 = new javax.swing.JLabel();
        lblNombres8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombres9 = new javax.swing.JLabel();
        lblNombres10 = new javax.swing.JLabel();
        lblNombres11 = new javax.swing.JLabel();
        lblNombres12 = new javax.swing.JLabel();
        lblNombres13 = new javax.swing.JLabel();
        lblNombres14 = new javax.swing.JLabel();
        lblNombres15 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();

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
        Background.add(btnRegistrarAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 30));

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
        Background.add(btnRegistrarAutomovil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 30));

        lblNombres4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres4.setText("$Cantidad");
        Background.add(lblNombres4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 110, 20));

        lblNombres5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres5.setText("Perteneciente a:");
        Background.add(lblNombres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, 20));

        lblNombres7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres7.setText("Placas para el automóvil con serie:");
        Background.add(lblNombres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, 20));

        lblNombres8.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres8.setText("Costo:");
        Background.add(lblNombres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 70, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 170, 10));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 500, 10));

        lblNombres9.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres9.setText("\"año\"");
        Background.add(lblNombres9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, 20));

        lblNombres10.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres10.setText("Marca:");
        Background.add(lblNombres10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 60, 20));

        lblNombres11.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres11.setText("Línea:");
        Background.add(lblNombres11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, 20));

        lblNombres12.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres12.setText("\"serie\"");
        Background.add(lblNombres12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 150, 20));

        lblNombres13.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres13.setText("\"marca\"");
        Background.add(lblNombres13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 20));

        lblNombres14.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres14.setText("\"línea\"");
        Background.add(lblNombres14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 20));

        lblNombres15.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres15.setText("Modelo:");
        Background.add(lblNombres15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, 20));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres.setText("\"nombres, apellidopa, apellidoma\"");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 330, 20));

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
    private javax.swing.JLabel lblNombres10;
    private javax.swing.JLabel lblNombres11;
    private javax.swing.JLabel lblNombres12;
    private javax.swing.JLabel lblNombres13;
    private javax.swing.JLabel lblNombres14;
    private javax.swing.JLabel lblNombres15;
    private javax.swing.JLabel lblNombres4;
    private javax.swing.JLabel lblNombres5;
    private javax.swing.JLabel lblNombres7;
    private javax.swing.JLabel lblNombres8;
    private javax.swing.JLabel lblNombres9;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
