package org.itson.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class FrmMenuConsultas extends javax.swing.JFrame {

    private static final Logger LOG
            = Logger.getLogger(FrmMenuConsultas.class.getName());

    public FrmMenuConsultas() {
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
        btnHistorialUsuario = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
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
        lblBienvenido.setText("Consultas");
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

        btnHistorialUsuario.setBackground(new java.awt.Color(121, 90, 59));
        btnHistorialUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnHistorialUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialUsuario.setText("Historial Trámites Usuario");
        btnHistorialUsuario.setBorder(null);
        btnHistorialUsuario.setBorderPainted(false);
        btnHistorialUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorialUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialUsuarioActionPerformed(evt);
            }
        });
        Background.add(btnHistorialUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 300, 70));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//CHECKSTYLE:ON

//CHECKSTYLE:OFF
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
//CHECKSTYLE:ON

        try {
            this.regresar();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al regresar");
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

//CHECKSTYLE:OFF
    private void btnHistorialUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialUsuarioActionPerformed
//CHECKSTYLE:ON

        try {
            this.cargarHistorialUsuario();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al regresar");
        }
    }//GEN-LAST:event_btnHistorialUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnHistorialUsuario;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        FormUtils.regresar(this, new FrmMenuPrincipal());
    }

    private void cargarHistorialUsuario() {
        FormUtils.cargarForm(new ConsultaBuscarPersona(), this);
    }

}
