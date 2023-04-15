package org.itson.presentacion;

import java.util.GregorianCalendar;
import java.util.Optional;
import java.util.logging.Logger;
import org.itson.daos.PersonasDAOImpl;
import org.itson.dominio.Licencia;
import org.itson.dominio.Persona;
import org.itson.dominio.TipoLicencia;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class FrmTramiteLicencia extends javax.swing.JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmTramiteLicencia.class.getName());
    /**
     * Persona a la que se le generará la licencia.
     */
    private Persona persona;
    /**
     * Duración de la licencia, en años.
     */
    private int duracion;
    /**
     * Costo de la licencia, en MXN.
     */
    private double costo;

    /**
     * Constructor principal.
     */
    public FrmTramiteLicencia() {
        initComponents();
        this.duracion = 0;
        this.costo = 0.0d;
    }

    private Optional<Persona> buscarPersona() {
        PersonasDAOImpl personas = new PersonasDAOImpl();
        return personas.getByRFC(this.txtRFC.getText());
    }

    private void imprimirDatosPersona() {
        this.txtNombres.setText(this.persona.getNombres());
        this.txtApellidoPaterno.setText(this.persona.getApellidoPaterno());
        this.txtApellidoMaterno.setText(this.persona.getApellidoMaterno());
    }

    private Licencia obtenerLicencia() {
        // TODO(Luis): Refactor
        TipoLicencia tipo = null;
        if (this.chbxDiscapacitado.isSelected()) {
            tipo = TipoLicencia.DISCAPACITADO;
        } else {
            tipo = TipoLicencia.NORMAL;
        }

        String item = cbxDuracion.getItemAt(cbxDuracion.getSelectedIndex());
        this.duracion = Integer.parseInt(item);

        final int unAnho = 1;
        final int dosAnhos = 2;
        final int tresAnhos = 3;

        // TODO(Luis): usar matriz
        if (!this.chbxDiscapacitado.isSelected()
                && duracion == unAnho) {
            final Double costoNormalUnAnho = 600d;
            this.costo = costoNormalUnAnho;

        } else if (this.chbxDiscapacitado.isSelected()
                && duracion == unAnho) {
            final Double costoDiscapacitadoUnAnho = 200d;
            this.costo = costoDiscapacitadoUnAnho;

        } else if (!this.chbxDiscapacitado.isSelected()
                && duracion == dosAnhos) {
            final Double costoNormalDosAnhos = 900d;
            this.costo = costoNormalDosAnhos;

        } else if (this.chbxDiscapacitado.isSelected()
                && duracion == dosAnhos) {
            final Double costoDiscapacitadoDosAnhos = 500d;
            this.costo = costoDiscapacitadoDosAnhos;

        } else if (!this.chbxDiscapacitado.isSelected()
                && duracion == tresAnhos) {
            final Double costoNormalTresAnhos = 1100d;
            this.costo = costoNormalTresAnhos;

        } else if (this.chbxDiscapacitado.isSelected()
                && duracion == tresAnhos) {
            final Double costoDiscapacitadoTresAnhos = 700d;
            this.costo = costoDiscapacitadoTresAnhos;
        }

        GregorianCalendar fechaInicio = new GregorianCalendar();
        int anhoFechaInicio = fechaInicio.get(GregorianCalendar.YEAR);
        int anhoCaducidad = anhoFechaInicio + this.duracion;
        GregorianCalendar fechaCaducidad
                = new GregorianCalendar(anhoCaducidad,
                        fechaInicio.get(GregorianCalendar.MONTH),
                        fechaInicio.get(GregorianCalendar.DAY_OF_MONTH));

        return new Licencia(
                fechaInicio,
                fechaCaducidad,
                this.duracion,
                tipo,
                this.costo,
                this.persona);
    }

    @SuppressWarnings("all")
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
        jSeparator5 = new javax.swing.JSeparator();
        lblDuracion = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblDiscapacitado = new javax.swing.JLabel();
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
        Background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 100, 30));

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
        Background.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));

        lblNombres.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres.setText("Nombres");
        Background.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 180, 20));

        txtNombres.setEditable(false);
        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setToolTipText("");
        txtNombres.setBorder(null);
        Background.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 20));

        lblApellidoPaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoPaterno.setText("Apellido paterno");
        Background.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, 20));

        txtApellidoPaterno.setEditable(false);
        txtApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoPaterno.setToolTipText("");
        txtApellidoPaterno.setBorder(null);
        Background.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, 20));

        lblApellidoMaterno.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoMaterno.setText("Apellido materno");
        Background.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 130, 20));

        txtApellidoMaterno.setEditable(false);
        txtApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoMaterno.setToolTipText("");
        txtApellidoMaterno.setBorder(null);
        Background.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 160, 20));

        lblRFC.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(255, 255, 255));
        lblRFC.setText("Buscar persona por RFC");
        Background.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtRFC.setForeground(new java.awt.Color(51, 51, 51));
        txtRFC.setToolTipText("");
        txtRFC.setBorder(null);
        Background.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 10));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 10));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, 10));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 160, 10));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 530, 10));

        lblDuracion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracion.setText("Duración (Años)");
        Background.add(lblDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 180, 20));
        Background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 10));

        lblDiscapacitado.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblDiscapacitado.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscapacitado.setText("¿Es discapacitado?");
        Background.add(lblDiscapacitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 130, 20));
        Background.add(chbxDiscapacitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        cbxDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        Background.add(cbxDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, 20));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new FrmTramites());
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        Licencia licencia = this.obtenerLicencia();
        // TODO(Luis): Crear DTO
        FormUtils.cargarForm(new FrmTramiteLicenciaConfirmacion(licencia, this.costo, this.duracion, this.persona), this);
    }//GEN-LAST:event_btnContinuarActionPerformed

    @SuppressWarnings("all")
    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        Optional<Persona> optPersona = this.buscarPersona();
        if (optPersona.isPresent()) {
            this.persona = optPersona.get();
            this.imprimirDatosPersona();
        } else {
            Dialogs.mostrarMensajeError(rootPane, "No se ha encontrado a la persona.");
        }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxDuracion;
    private javax.swing.JCheckBox chbxDiscapacitado;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDiscapacitado;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON
}
