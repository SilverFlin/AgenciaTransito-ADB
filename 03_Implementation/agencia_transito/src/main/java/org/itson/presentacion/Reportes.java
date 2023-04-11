package org.itson.presentacion;

import java.util.logging.Logger;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class Reportes extends javax.swing.JFrame {

    private static final Logger LOG
            = Logger.getLogger(Reportes.class.getName());

    public Reportes() {
        initComponents();
    }

//CHECKSTYLE:OFF
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnReporteTramites = new javax.swing.JButton();

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
        lblBienvenido.setText("Reportes");
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

        btnReporteTramites.setBackground(new java.awt.Color(121, 90, 59));
        btnReporteTramites.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnReporteTramites.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteTramites.setText("Trámites Realizados");
        btnReporteTramites.setBorder(null);
        btnReporteTramites.setBorderPainted(false);
        btnReporteTramites.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReporteTramites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteTramitesActionPerformed(evt);
            }
        });
        Background.add(btnReporteTramites, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 260, 70));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//CHECKSTYLE:ON

//CHECKSTYLE:OFF
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
//CHECKSTYLE:ON
        FormUtils.regresar(this, new FrmMenuPrincipal());
    }//GEN-LAST:event_btnRegresarActionPerformed
//CHECKSTYLE:OFF
    private void btnReporteTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteTramitesActionPerformed
//CHECKSTYLE:ON
        FormUtils.cargarForm(new ReportesTramites(), this);
    }//GEN-LAST:event_btnReporteTramitesActionPerformed

//CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReporteTramites;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables
//CHECKSTYLE:ON

}
