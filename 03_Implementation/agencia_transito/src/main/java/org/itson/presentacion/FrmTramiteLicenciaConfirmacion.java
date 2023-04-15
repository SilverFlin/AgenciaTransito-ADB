package org.itson.presentacion;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.daos.LicenciasDAOImpl;
import org.itson.dominio.Licencia;
import org.itson.dominio.Pago;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class FrmTramiteLicenciaConfirmacion extends javax.swing.JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmTramiteLicenciaConfirmacion.class.getName());
    /**
     * Licencia cargada.
     */
    private final Licencia licencia;

    /**
     * Dueño de la licencia.
     */
    private final Persona persona;

    /**
     * Duración de la licencia en años.
     */
    private final int duracion;

    /**
     * Costo de la licencia en MXN.
     */
    private final double costo;

    /**
     * Constructor principal.
     *
     * @param licencia
     * @param costo
     * @param duracion
     * @param persona
     */
    public FrmTramiteLicenciaConfirmacion(
            final Licencia licencia,
            final double costo,
            final int duracion,
            final Persona persona
    ) {
        this.licencia = licencia;
        this.costo = costo;
        this.duracion = duracion;
        this.persona = persona;
        initComponents();
        String nombreCompleto
                = this.persona.getNombres() + " "
                + this.persona.getApellidoPaterno()
                + " " + this.persona.getApellidoMaterno();
        this.lblNombreCompleto.setText(nombreCompleto);
        this.lblDuracion.setText(String.valueOf(this.duracion));
        this.lblCantidadCosto.setText(String.valueOf(this.costo));
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNombreCompleto = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblCantidadCosto = new javax.swing.JLabel();
        lblNombres5 = new javax.swing.JLabel();
        lblNombres6 = new javax.swing.JLabel();
        lblNombres7 = new javax.swing.JLabel();
        lblNombres8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

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

        btnAceptar.setBackground(new java.awt.Color(121, 90, 59));
        btnAceptar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        Background.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, 30));

        btnCancelar.setBackground(new java.awt.Color(121, 90, 59));
        btnCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 100, 30));

        lblNombreCompleto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCompleto.setText("\"nombres, apellidopa, apellidoma\"");
        Background.add(lblNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 310, 20));

        lblDuracion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("No.");
        Background.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 20));

        lblCantidadCosto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblCantidadCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadCosto.setText("$Cantidad");
        Background.add(lblCantidadCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 110, 20));

        lblNombres5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres5.setText("año(s).");
        Background.add(lblNombres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 20));

        lblNombres6.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres6.setText("con la duración de");
        Background.add(lblNombres6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 20));

        lblNombres7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres7.setText("Licencia para la persona:");
        Background.add(lblNombres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, 20));

        lblNombres8.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres8.setText("Costo:");
        Background.add(lblNombres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 10));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 500, 10));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        FormUtils.regresar(this, new FrmTramiteLicencia());
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        LicenciasDAOImpl tramites = new LicenciasDAOImpl();
        try {
            Pago pago = new Pago();
            pago.setFechaPago(new GregorianCalendar());
            pago.setMonto(this.costo);
            pago.setTramite(this.licencia);
            this.licencia.setPago(pago);
            tramites.save(this.licencia);
            Dialogs.mostrarMensajeExito(rootPane, "Licencia registrada exitosamente.");
            FormUtils.cargarForm(new FrmMenuPrincipal(), this);
        } catch (PersistenciaException ex) {
            LOG.log(Level.SEVERE, null, ex);
            Dialogs.mostrarMensajeError(rootPane, "No se pudo registrar la licencia.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    @SuppressWarnings("all")
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar el registro?", "CANCELAR REGISTRO", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            FormUtils.cargarForm(new FrmRegistros(), this);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCantidadCosto;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombres5;
    private javax.swing.JLabel lblNombres6;
    private javax.swing.JLabel lblNombres7;
    private javax.swing.JLabel lblNombres8;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

}
