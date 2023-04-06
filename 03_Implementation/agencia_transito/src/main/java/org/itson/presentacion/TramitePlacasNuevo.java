package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramitePlacasNuevo extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramitePlacasNuevo.class.getName());

    public TramitePlacasNuevo() {
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
        campoTextoNombres = new javax.swing.JTextField();
        lblApellidoPaterno = new javax.swing.JLabel();
        campoTextoApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        campoTextoApellidoMaterno = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        campoTextoEdad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombres1 = new javax.swing.JLabel();
        campoTextoNombres1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblApellidoPaterno1 = new javax.swing.JLabel();
        campoTextoApellidoPaterno1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblApellidoMaterno1 = new javax.swing.JLabel();
        campoTextoApellidoMaterno1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblNombres2 = new javax.swing.JLabel();
        campoTextoNombres2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblApellidoPaterno2 = new javax.swing.JLabel();
        campoTextoApellidoPaterno2 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

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
        lblBienvenido.setText("Trámite Placas (Auto Nuevo)");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

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
        btnRegistrarAutomovil.setText("Continuar");
        btnRegistrarAutomovil.setBorder(null);
        btnRegistrarAutomovil.setBorderPainted(false);
        btnRegistrarAutomovil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovilActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 100, 30));

        btnRegistrarAutomovil1.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarAutomovil1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnRegistrarAutomovil1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutomovil1.setText("Buscar persona");
        btnRegistrarAutomovil1.setBorder(null);
        btnRegistrarAutomovil1.setBorderPainted(false);
        btnRegistrarAutomovil1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovil1ActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 120, 30));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres.setText("Nombres");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 20));

        campoTextoNombres.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoNombres.setToolTipText("");
        campoTextoNombres.setBorder(null);
        Background.add(campoTextoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 20));

        lblApellidoPaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoPaterno.setText("Apellido paterno");
        Background.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 20));

        campoTextoApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoPaterno.setToolTipText("");
        campoTextoApellidoPaterno.setBorder(null);
        Background.add(campoTextoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 160, 20));

        lblApellidoMaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoMaterno.setText("Apellido materno");
        Background.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 130, 20));

        campoTextoApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoMaterno.setToolTipText("");
        campoTextoApellidoMaterno.setBorder(null);
        Background.add(campoTextoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 160, 20));

        lblEdad.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblEdad.setText("RFC");
        Background.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        campoTextoEdad.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoEdad.setToolTipText("");
        campoTextoEdad.setBorder(null);
        Background.add(campoTextoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 10));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 10));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, 10));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 160, 10));

        lblNombres1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres1.setText("Marca");
        Background.add(lblNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 20));

        campoTextoNombres1.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoNombres1.setToolTipText("");
        campoTextoNombres1.setBorder(null);
        Background.add(campoTextoNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 530, 10));

        lblApellidoPaterno1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoPaterno1.setText("Línea");
        Background.add(lblApellidoPaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, 20));

        campoTextoApellidoPaterno1.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoPaterno1.setToolTipText("");
        campoTextoApellidoPaterno1.setBorder(null);
        Background.add(campoTextoApellidoPaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 160, 10));

        lblApellidoMaterno1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoMaterno1.setText("Modelo");
        Background.add(lblApellidoMaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 130, 20));

        campoTextoApellidoMaterno1.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoMaterno1.setToolTipText("");
        campoTextoApellidoMaterno1.setBorder(null);
        Background.add(campoTextoApellidoMaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 160, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 160, 10));

        lblNombres2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblNombres2.setText("Color");
        Background.add(lblNombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 20));

        campoTextoNombres2.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoNombres2.setToolTipText("");
        campoTextoNombres2.setBorder(null);
        Background.add(campoTextoNombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, 20));
        Background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 170, 10));

        lblApellidoPaterno2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        lblApellidoPaterno2.setText("No. Serie");
        Background.add(lblApellidoPaterno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 20));

        campoTextoApellidoPaterno2.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoApellidoPaterno2.setToolTipText("");
        campoTextoApellidoPaterno2.setBorder(null);
        Background.add(campoTextoApellidoPaterno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 160, 20));
        Background.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 10));
        Background.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 10));

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
    private javax.swing.JTextField campoTextoApellidoMaterno;
    private javax.swing.JTextField campoTextoApellidoMaterno1;
    private javax.swing.JTextField campoTextoApellidoPaterno;
    private javax.swing.JTextField campoTextoApellidoPaterno1;
    private javax.swing.JTextField campoTextoApellidoPaterno2;
    private javax.swing.JTextField campoTextoEdad;
    private javax.swing.JTextField campoTextoNombres;
    private javax.swing.JTextField campoTextoNombres1;
    private javax.swing.JTextField campoTextoNombres2;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoMaterno1;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblApellidoPaterno1;
    private javax.swing.JLabel lblApellidoPaterno2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblNombres2;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
