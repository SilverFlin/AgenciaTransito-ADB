package org.itson.presentacion;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.daos.PersonasDAOImpl;
import org.itson.daos.VehiculosDAOImpl;
import org.itson.dominio.Automovil;
import org.itson.dominio.Vehiculo;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.Dialogs;
import static org.itson.utils.Dialogs.mostrarMensajeError;
import static org.itson.utils.Dialogs.mostrarMensajeExito;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class RegistroAutomovil extends javax.swing.JFrame {

    private static final Logger LOG
            = Logger.getLogger(RegistroAutomovil.class.getName());
    private Optional<Persona> optionalPersona;
    private Persona persona;

    public RegistroAutomovil() {
        this.optionalPersona = null;
        this.persona = null;
        initComponents();
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

    private Automovil obtenerAutomovil() {
        // TODO(Luis): Especificar variables
        return new Automovil(
                this.persona,
                this.txtSerie.getText(),
                this.txtLinea.getText(),
                this.txtMarca.getText(),
                this.txtMarca.getText(),
                this.txtColor.getText()
        );
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
        btnRegistrarAutomovil = new javax.swing.JButton();
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
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblLinea = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblSerie = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

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
        btnRegistrarAutomovil.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnRegistrarAutomovil.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutomovil.setText("Registrar");
        btnRegistrarAutomovil.setBorder(null);
        btnRegistrarAutomovil.setBorderPainted(false);
        btnRegistrarAutomovil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovilActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 100, 30));

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

        txtNombres.setEditable(false);
        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setToolTipText("");
        txtNombres.setBorder(null);
        Background.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 20));

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

        lblMarca.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca");
        Background.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, 20));

        txtMarca.setForeground(new java.awt.Color(51, 51, 51));
        txtMarca.setToolTipText("");
        txtMarca.setBorder(null);
        Background.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 530, 10));

        lblLinea.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblLinea.setText("Línea");
        Background.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, 20));

        txtLinea.setForeground(new java.awt.Color(51, 51, 51));
        txtLinea.setToolTipText("");
        txtLinea.setBorder(null);
        Background.add(txtLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 160, 10));

        lblModelo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo");
        Background.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 130, 20));

        txtModelo.setForeground(new java.awt.Color(51, 51, 51));
        txtModelo.setToolTipText("");
        txtModelo.setBorder(null);
        Background.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 160, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 160, 10));

        lblColor.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Color");
        Background.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 20));

        txtColor.setForeground(new java.awt.Color(51, 51, 51));
        txtColor.setToolTipText("");
        txtColor.setBorder(null);
        Background.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 170, 20));
        Background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 170, 10));

        lblSerie.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblSerie.setText("No. Serie");
        Background.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, 20));

        txtSerie.setForeground(new java.awt.Color(51, 51, 51));
        txtSerie.setToolTipText("");
        txtSerie.setBorder(null);
        Background.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 160, 20));
        Background.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 10));
        Background.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 10));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//CHECKSTYLE:ON

//CHECKSTYLE:OFF
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
//CHECKSTYLE:ON
        FormUtils.regresar(this, new Registros());
    }//GEN-LAST:event_btnRegresarActionPerformed

//CHECKSTYLE:OFF
    private void btnRegistrarAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutomovilActionPerformed
//CHECKSTYLE:ON

        Vehiculo automovil = this.obtenerAutomovil();
        VehiculosDAOImpl vehiculos = new VehiculosDAOImpl();
        try {
            vehiculos.save(automovil);
            mostrarMensajeExito(rootPane, "Automóvil registrado exitosamente.");
            FormUtils.cargarForm(new FrmMenuPrincipal(), this);
        } catch (PersistenciaException ex) {
            LOG.log(Level.SEVERE, null, ex);
            mostrarMensajeError(rootPane, "No se pudo registrar el automóvil.");
        }
    }//GEN-LAST:event_btnRegistrarAutomovilActionPerformed
//CHECKSTYLE:OFF
    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
//CHECKSTYLE:ON

        this.optionalPersona = this.buscarPersona();
        if (this.optionalPersona.isPresent()) {
            this.persona = optionalPersona.get();
            this.imprimirDatosPersona();
        } else {
            Dialogs.mostrarMensajeError(rootPane, "No se ha encontrado a la persona.");
        }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

//CHECKSTYLE:OFF

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnRegistrarAutomovil;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
//CHECKSTYLE:ON

    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
