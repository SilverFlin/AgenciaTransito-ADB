package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramitePlacas extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramitePlacas.class.getName());

    public TramitePlacas() {
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
        btnTramitar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        cbxVehiculo = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();

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

        btnTramitar.setBackground(new java.awt.Color(121, 90, 59));
        btnTramitar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnTramitar.setForeground(new java.awt.Color(255, 255, 255));
        btnTramitar.setText("Tramitar");
        btnTramitar.setBorder(null);
        btnTramitar.setBorderPainted(false);
        btnTramitar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTramitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramitarActionPerformed(evt);
            }
        });
        Background.add(btnTramitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, 30));

        lblEstado.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado");
        Background.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 110, 20));

        lblVehiculo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblVehiculo.setText("Vehículo");
        Background.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, 10));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 10));

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil" }));
        Background.add(cbxVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Usado" }));
        Background.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, -1));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new Tramites());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnTramitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitarActionPerformed
        String vehiculo = this.cbxVehiculo.getItemAt(this.cbxVehiculo.getSelectedIndex());
        String estado = this.cbxEstado.getItemAt(this.cbxEstado.getSelectedIndex());
        if(vehiculo.equalsIgnoreCase("automovil") && estado.equalsIgnoreCase("nuevo")){
            FormUtils.cargarForm(new TramitePlacasNuevo(), this);
        } else {
            FormUtils.cargarForm(new TramitePlacasUsado(), this);
        }
    }//GEN-LAST:event_btnTramitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTramitar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxVehiculo;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblVehiculo;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
