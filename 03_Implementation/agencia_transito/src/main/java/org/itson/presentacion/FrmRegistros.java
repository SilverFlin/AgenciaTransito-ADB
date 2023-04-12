package org.itson.presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.excepciones.PersistenciaException;
import org.itson.temptest.TestPersonasDAO;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class FrmRegistros extends javax.swing.JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmRegistros.class.getName());

    /**
     * Constructor principal.
     */
    public FrmRegistros() {
        initComponents();
    }

    private void registrarPersonas(final int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            try {
                TestPersonasDAO.agregaPersonaFalsa();
            } catch (PersistenciaException ex) {
                LOG.log(Level.SEVERE, "Error al registrar personas");
                return;
            }
        }
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrarAutomovil = new javax.swing.JButton();
        btnRegistrarPersonas = new javax.swing.JButton();

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
        lblBienvenido.setText("Registros");
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

        btnRegistrarAutomovil.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarAutomovil.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnRegistrarAutomovil.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutomovil.setText("Registrar Automóvil");
        btnRegistrarAutomovil.setBorder(null);
        btnRegistrarAutomovil.setBorderPainted(false);
        btnRegistrarAutomovil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovilActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, 70));

        btnRegistrarPersonas.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarPersonas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnRegistrarPersonas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonas.setText("Registrar Personas");
        btnRegistrarPersonas.setBorder(null);
        btnRegistrarPersonas.setBorderPainted(false);
        btnRegistrarPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonasActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 260, 70));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new FrmMenuPrincipal());
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnRegistrarAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutomovilActionPerformed
        FormUtils.cargarForm(new FrmRegistroAutomovil(), this);
    }//GEN-LAST:event_btnRegistrarAutomovilActionPerformed

    @SuppressWarnings("all")
    private void btnRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonasActionPerformed
        int cantidadPersonasIngresar = 20;
        registrarPersonas(cantidadPersonasIngresar);
        Dialogs.mostrarMensajeExito(rootPane, "Se han registrado 20 personas exitosamente.");
    }//GEN-LAST:event_btnRegistrarPersonasActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrarAutomovil;
    private javax.swing.JButton btnRegistrarPersonas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

}