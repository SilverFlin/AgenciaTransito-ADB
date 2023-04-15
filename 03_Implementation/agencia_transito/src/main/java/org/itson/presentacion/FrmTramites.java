package org.itson.presentacion;

import java.util.logging.Logger;
import org.itson.utils.FormUtils;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class FrmTramites extends javax.swing.JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmTramites.class.getName());

    /**
     * Constructor principal.
     */
    public FrmTramites() {
        initComponents();
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnTramitePlacas = new javax.swing.JButton();
        btnTramiteLicencia = new javax.swing.JButton();

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
        lblBienvenido.setText("Trámites");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

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

        btnTramitePlacas.setBackground(new java.awt.Color(121, 90, 59));
        btnTramitePlacas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnTramitePlacas.setForeground(new java.awt.Color(255, 255, 255));
        btnTramitePlacas.setText("Trámite de Placas");
        btnTramitePlacas.setBorder(null);
        btnTramitePlacas.setBorderPainted(false);
        btnTramitePlacas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTramitePlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramitePlacasActionPerformed(evt);
            }
        });
        Background.add(btnTramitePlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, 70));

        btnTramiteLicencia.setBackground(new java.awt.Color(121, 90, 59));
        btnTramiteLicencia.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnTramiteLicencia.setForeground(new java.awt.Color(255, 255, 255));
        btnTramiteLicencia.setText("Trámite de Licencia");
        btnTramiteLicencia.setBorder(null);
        btnTramiteLicencia.setBorderPainted(false);
        btnTramiteLicencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTramiteLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramiteLicenciaActionPerformed(evt);
            }
        });
        Background.add(btnTramiteLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 260, 70));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnTramitePlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitePlacasActionPerformed
        this.cargarTramitePlacas();
    }//GEN-LAST:event_btnTramitePlacasActionPerformed

    @SuppressWarnings("all")
    private void btnTramiteLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramiteLicenciaActionPerformed
        this.cargarTramiteLicencia();
    }//GEN-LAST:event_btnTramiteLicenciaActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTramiteLicencia;
    private javax.swing.JButton btnTramitePlacas;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void regresar() {
        FormUtils.regresar(this, new FrmMenuPrincipal());
    }

    private void cargarTramitePlacas() {
        FormUtils.cargarForm(new FrmTramitePlacas(), this);
    }

    private void cargarTramiteLicencia() {
        FormUtils.cargarForm(new FrmTramiteLicencia(), this);
    }
}
