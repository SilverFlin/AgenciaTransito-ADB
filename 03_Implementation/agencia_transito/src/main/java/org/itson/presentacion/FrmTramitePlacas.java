package org.itson.presentacion;

import java.util.Optional;
import java.util.logging.Logger;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Vehiculo;
import static org.itson.utils.Dialogs.mostrarMensajeError;
import org.itson.utils.FormUtils;
import static org.itson.utils.FormUtils.cargarForm;
import static org.itson.utils.FormUtils.getItemComboBox;
import static org.itson.utils.FormUtils.pedirInputUsuario;

/**
 *
 * @author Toled
 */
public class FrmTramitePlacas extends javax.swing.JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmTramitePlacas.class.getName());
    /**
     * Unit of Work, que contiene todos los daos.
     */
    private final UnitOfWork unitOfWork = new UnitOfWork();

    /**
     * Constructor principal.
     */
    public FrmTramitePlacas() {
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

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new FrmTramites());
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnTramitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitarActionPerformed
        this.tramitar();
    }//GEN-LAST:event_btnTramitarActionPerformed

    //CHECKSTYLE:OFF
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
    //CHECKSTYLE:ON

    private void tramitar() {
        String seleccionVehiculo = getItemComboBox(this.cbxVehiculo);
        String seleccionEstado = getItemComboBox(this.cbxEstado);

        // TODO(Luis): Mover a enum
        String tipoVehiculoAutomovil = "automovil";

        boolean isAutomovil
                = seleccionVehiculo.equalsIgnoreCase(tipoVehiculoAutomovil);

        boolean isNuevo = seleccionEstado.equalsIgnoreCase("nuevo");

        if (isAutomovil) {

            if (isNuevo) {
                this.tramitarAutomovilNuevo();
            } else {
                this.tramitarAutomovilUsado();
            }

        } else {
            throw new IllegalStateException("Campos seleccionados inválidos");
        }

    }

    private void tramitarAutomovilNuevo() {
        FormUtils.cargarForm(new FrmTramitePlacasNuevo(), this);
    }

    private void tramitarAutomovilUsado() {
        String matricula = this.pedirMatricula();
        Optional<Vehiculo> optVehiculo
                = unitOfWork.vehiculosDAO().getByMatricula(matricula);

        if (optVehiculo.isEmpty()) {
            mostrarMensajeError(rootPane, "Vehículo no encontrado");
            return;
        }

        ConfirmacionPlacasDTO confirmacionPlacasDTO
                = new ConfirmacionPlacasDTO();
        Vehiculo vehiculo = optVehiculo.get();
        confirmacionPlacasDTO.setAutomovil(vehiculo);
        final double costoNuevo = 1500d;
        confirmacionPlacasDTO.setCosto(costoNuevo);
        confirmacionPlacasDTO.setPersona(vehiculo.getDuenho());
        confirmacionPlacasDTO.setTipo(TipoPlaca.VEHICULO_USADO);

        cargarForm(new FrmResumenVehiculo(this, confirmacionPlacasDTO), this);

    }

    private String pedirMatricula() {
        String titulo = "Ingresar Matrícula";
        String msg = "Ingresa la matrícula de la placa activa";
        return pedirInputUsuario(rootPane, titulo, msg);
    }
}
