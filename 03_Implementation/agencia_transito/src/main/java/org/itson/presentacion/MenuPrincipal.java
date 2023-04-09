package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(MenuPrincipal.class.getName());

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnTramites = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(147, 17, 17));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenido.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 28)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Menú");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnSalir.setBackground(new java.awt.Color(102, 10, 10));
        btnSalir.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 40));

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        btnConsultas.setBackground(new java.awt.Color(173, 139, 106));
        btnConsultas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultas.setText("Consultas");
        btnConsultas.setBorder(null);
        btnConsultas.setBorderPainted(false);
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        Background.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 300, 170));

        btnRegistros.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistros.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnRegistros.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistros.setText("Registros");
        btnRegistros.setBorder(null);
        btnRegistros.setBorderPainted(false);
        btnRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        Background.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 170));

        btnReportes.setBackground(new java.awt.Color(121, 90, 59));
        btnReportes.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        Background.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 300, 170));

        btnTramites.setBackground(new java.awt.Color(173, 139, 106));
        btnTramites.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnTramites.setForeground(new java.awt.Color(255, 255, 255));
        btnTramites.setText("Trámites");
        btnTramites.setBorder(null);
        btnTramites.setBorderPainted(false);
        btnTramites.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTramites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramitesActionPerformed(evt);
            }
        });
        Background.add(btnTramites, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 300, 170));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        FormUtils.cargarForm(new Consultas(), this);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        FormUtils.cargarForm(new Registros(), this);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        FormUtils.cargarForm(new Reportes(), this);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        FormUtils.cargarForm(new Tramites(), this);
    }//GEN-LAST:event_btnTramitesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTramites;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables


}
