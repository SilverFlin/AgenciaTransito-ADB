package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramitePlacasUsado extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramitePlacasUsado.class.getName());

    public TramitePlacasUsado() {
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
        btnHistorialPlacas = new javax.swing.JButton();
        btnBuscarAuto = new javax.swing.JButton();
        lblNombres = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblPlacas = new javax.swing.JLabel();
        txtPlacas = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblSerie = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblLinea = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        btnBuscarPersona = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblLicencia = new javax.swing.JLabel();
        txtLicencia = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

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
        lblBienvenido.setText("Trámite Placas (Auto Usado)");
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

        btnHistorialPlacas.setBackground(new java.awt.Color(121, 90, 59));
        btnHistorialPlacas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnHistorialPlacas.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialPlacas.setText("Historial de placas");
        btnHistorialPlacas.setBorder(null);
        btnHistorialPlacas.setBorderPainted(false);
        btnHistorialPlacas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorialPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialPlacasActionPerformed(evt);
            }
        });
        Background.add(btnHistorialPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 30));

        btnBuscarAuto.setBackground(new java.awt.Color(121, 90, 59));
        btnBuscarAuto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnBuscarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAuto.setText("Buscar auto");
        btnBuscarAuto.setBorder(null);
        btnBuscarAuto.setBorderPainted(false);
        btnBuscarAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAutoActionPerformed(evt);
            }
        });
        Background.add(btnBuscarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 30));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 20));

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        Background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 20));

        lblApellidoPaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoPaterno.setText("Apellido paterno");
        Background.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 20));

        txtApellidoPaterno.setEditable(false);
        txtApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoPaterno.setToolTipText("");
        txtApellidoPaterno.setBorder(null);
        Background.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 160, 20));

        lblApellidoMaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoMaterno.setText("Apellido materno");
        Background.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 130, 20));

        txtApellidoMaterno.setEditable(false);
        txtApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoMaterno.setToolTipText("");
        txtApellidoMaterno.setBorder(null);
        Background.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 160, 20));

        lblRFC.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(255, 255, 255));
        lblRFC.setText("RFC");
        Background.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtRFC.setForeground(new java.awt.Color(51, 51, 51));
        txtRFC.setToolTipText("");
        txtRFC.setBorder(null);
        Background.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 10));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 10));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, 10));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 160, 10));

        lblPlacas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblPlacas.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacas.setText("Placas del auto");
        Background.add(lblPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 20));

        txtPlacas.setForeground(new java.awt.Color(51, 51, 51));
        txtPlacas.setToolTipText("");
        txtPlacas.setBorder(null);
        Background.add(txtPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 530, 10));

        lblModelo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo");
        Background.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 180, 20));

        txtModelo.setEditable(false);
        txtModelo.setForeground(new java.awt.Color(51, 51, 51));
        txtModelo.setToolTipText("");
        txtModelo.setBorder(null);
        Background.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 160, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 160, 10));

        lblSerie.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblSerie.setText("No. Serie");
        Background.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 130, 20));

        txtSerie.setEditable(false);
        txtSerie.setForeground(new java.awt.Color(51, 51, 51));
        txtSerie.setToolTipText("");
        txtSerie.setBorder(null);
        Background.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 160, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 160, 10));

        lblMarca.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca");
        Background.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 20));

        txtMarca.setEditable(false);
        txtMarca.setForeground(new java.awt.Color(51, 51, 51));
        txtMarca.setToolTipText("");
        txtMarca.setBorder(null);
        Background.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, 20));
        Background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 170, 10));

        lblLinea.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblLinea.setText("Línea");
        Background.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 20));

        txtLinea.setEditable(false);
        txtLinea.setForeground(new java.awt.Color(51, 51, 51));
        txtLinea.setToolTipText("");
        txtLinea.setBorder(null);
        Background.add(txtLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 160, 20));
        Background.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 10));
        Background.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 10));

        btnBuscarPersona.setBackground(new java.awt.Color(121, 90, 59));
        btnBuscarPersona.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnBuscarPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPersona.setText("Buscar persona");
        btnBuscarPersona.setBorder(null);
        btnBuscarPersona.setBorderPainted(false);
        btnBuscarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });
        Background.add(btnBuscarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 120, 30));

        btnContinuar.setBackground(new java.awt.Color(121, 90, 59));
        btnContinuar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(null);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        Background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 100, 30));

        lblLicencia.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblLicencia.setForeground(new java.awt.Color(255, 255, 255));
        lblLicencia.setText("¿Cuenta con licencia?");
        Background.add(lblLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        txtLicencia.setEditable(false);
        txtLicencia.setForeground(new java.awt.Color(51, 51, 51));
        txtLicencia.setToolTipText("");
        txtLicencia.setBorder(null);
        Background.add(txtLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 30, 20));
        Background.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 30, 10));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnHistorialPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistorialPlacasActionPerformed

    private void btnBuscarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAutoActionPerformed

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnBuscarAuto;
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnHistorialPlacas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
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
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblLicencia;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPlacas;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtLicencia;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlacas;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}