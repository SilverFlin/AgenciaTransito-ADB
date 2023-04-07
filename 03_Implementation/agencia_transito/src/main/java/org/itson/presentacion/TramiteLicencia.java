package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramiteLicencia extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramiteLicencia.class.getName());

    public TramiteLicencia() {
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
        btnContinuar = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
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
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblFechaNacimiento = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblDuracion = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblDiscapacitado = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        dtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        chbxDiscapacitado = new javax.swing.JCheckBox();
        cbxDuracion = new javax.swing.JComboBox<>();

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
        Background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 100, 30));

        btnCargarDatos.setBackground(new java.awt.Color(121, 90, 59));
        btnCargarDatos.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCargarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarDatos.setText("Cargar datos");
        btnCargarDatos.setBorder(null);
        btnCargarDatos.setBorderPainted(false);
        btnCargarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });
        Background.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, 30));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 20));

        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setToolTipText("");
        txtNombres.setBorder(null);
        Background.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 20));

        lblApellidoPaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoPaterno.setText("Apellido paterno");
        Background.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 20));

        txtApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoPaterno.setToolTipText("");
        txtApellidoPaterno.setBorder(null);
        Background.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 160, 20));

        lblApellidoMaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoMaterno.setText("Apellido materno");
        Background.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 130, 20));

        txtApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoMaterno.setToolTipText("");
        txtApellidoMaterno.setBorder(null);
        Background.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 160, 20));

        lblRFC.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(255, 255, 255));
        lblRFC.setText("Buscar persona por RFC");
        Background.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtRFC.setForeground(new java.awt.Color(51, 51, 51));
        txtRFC.setToolTipText("");
        txtRFC.setBorder(null);
        Background.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 10));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 10));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, 10));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 160, 10));

        lblTelefono.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono");
        Background.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 20));

        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setToolTipText("");
        txtTelefono.setBorder(null);
        Background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 530, 10));

        lblFechaNacimiento.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de Nacimiento");
        Background.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 10));

        lblDuracion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("Duración (Años)");
        Background.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, 20));
        Background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, 10));

        lblDiscapacitado.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblDiscapacitado.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscapacitado.setText("¿Es discapacitado?");
        Background.add(lblDiscapacitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 130, 20));
        Background.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 10));
        Background.add(dtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 130, 20));
        Background.add(chbxDiscapacitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        cbxDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        Background.add(cbxDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 20));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxDuracion;
    private javax.swing.JCheckBox chbxDiscapacitado;
    private com.toedter.calendar.JDateChooser dtFechaNacimiento;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDiscapacitado;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables


    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
