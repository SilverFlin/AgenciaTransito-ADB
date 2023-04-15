package org.itson.presentacion;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.dominio.Persona;
import org.itson.dominio.Placa;
import org.itson.dominio.Vehiculo;
import org.itson.utils.FormUtils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class FrmResumenVehiculo extends JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmResumenVehiculo.class.getName());

    /**
     * Unit of Work.
     */
    private UnitOfWork unitOfWork;

    /**
     * Data Transfer Object de confirmacion placas.
     */
    private ConfirmacionPlacasDTO confirmacionPlacasDTO;
    /**
     * JFrame anterior.
     */
    private JFrame frmAnterior;

    /**
     * Constructor principal del Frame.
     *
     * @param frmAnterior frm anterior.
     * @param confirmacionPlacasDTO DTO de confirmación placas.
     */
    public FrmResumenVehiculo(
            final JFrame frmAnterior,
            final ConfirmacionPlacasDTO confirmacionPlacasDTO
    ) {
        try {
            this.frmAnterior = frmAnterior;
            this.confirmacionPlacasDTO = confirmacionPlacasDTO;
            this.unitOfWork = new UnitOfWork();
            initComponents();
            this.cargarDatosResumen();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al cargar Frame");
            this.regresar();
        }

    }

    private void cargarTablaHistorialPlacas() {

        this.vaciarTabla();
        DefaultTableModel modeloTabla
                = (DefaultTableModel) this.tblHistorialPlacas.getModel();

        Optional<Vehiculo> optVehiculo
                = unitOfWork.vehiculosDAO()
                        .get(this.confirmacionPlacasDTO
                                .getAutomovil().getId());
        if (optVehiculo.isEmpty()) {
            return;
        }
        List<Placa> placas = optVehiculo.get().getHistorialPlacas();
        for (Placa placa : placas) {
            Object[] fila = {placa.getMatricula()};
            modeloTabla.addRow(fila);
        }
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOperaciones = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        panelHistorialPlacas = new javax.swing.JScrollPane();
        tblHistorialPlacas = new javax.swing.JTable();
        lblSubtitulo = new javax.swing.JLabel();
        lblHistorialPlacas = new javax.swing.JLabel();
        txtDuenho = new javax.swing.JTextField();
        lblDuenho = new javax.swing.JLabel();
        txtNumeroSerie = new javax.swing.JTextField();
        lblNumeroSerie = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        lblLinea = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();

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

        lblOperaciones.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 28)); // NOI18N
        lblOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblOperaciones.setText("Trámite Placas");
        jPanel1.add(lblOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(102, 10, 10));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 40));

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        tblHistorialPlacas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistorialPlacas.setColumnSelectionAllowed(true);
        panelHistorialPlacas.setViewportView(tblHistorialPlacas);
        tblHistorialPlacas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        Background.add(panelHistorialPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 150, 190));

        lblSubtitulo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("RESUMEN DE VEHÍCULO");
        Background.add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 190, 20));

        lblHistorialPlacas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblHistorialPlacas.setForeground(new java.awt.Color(255, 255, 255));
        lblHistorialPlacas.setText(" Historial Placas");
        Background.add(lblHistorialPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 120, 20));

        txtDuenho.setEditable(false);
        txtDuenho.setForeground(new java.awt.Color(51, 51, 51));
        txtDuenho.setToolTipText("");
        txtDuenho.setBorder(null);
        Background.add(txtDuenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 20));

        lblDuenho.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblDuenho.setForeground(new java.awt.Color(255, 255, 255));
        lblDuenho.setText("Dueño");
        Background.add(lblDuenho, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 20));

        txtNumeroSerie.setEditable(false);
        txtNumeroSerie.setForeground(new java.awt.Color(51, 51, 51));
        txtNumeroSerie.setToolTipText("");
        txtNumeroSerie.setBorder(null);
        Background.add(txtNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 20));

        lblNumeroSerie.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNumeroSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroSerie.setText("No. Serie");
        Background.add(lblNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 20));

        txtMarca.setEditable(false);
        txtMarca.setForeground(new java.awt.Color(51, 51, 51));
        txtMarca.setToolTipText("");
        txtMarca.setBorder(null);
        Background.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 20));

        lblMarca.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca");
        Background.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 20));

        txtLinea.setEditable(false);
        txtLinea.setForeground(new java.awt.Color(51, 51, 51));
        txtLinea.setToolTipText("");
        txtLinea.setBorder(null);
        Background.add(txtLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 120, 20));

        lblLinea.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblLinea.setText("Línea");
        Background.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 20));

        txtColor.setEditable(false);
        txtColor.setForeground(new java.awt.Color(51, 51, 51));
        txtColor.setToolTipText("");
        txtColor.setBorder(null);
        Background.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, 20));

        lblColor.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Color");
        Background.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 20));

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
        Background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 100, 30));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        try {
            this.regresar();
        } catch (Exception e) {
            // TODO(Luis): cambiar msg a constantes
            LOG.log(Level.SEVERE, "Error al regresar form");
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.continuar();
    }//GEN-LAST:event_btnContinuarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDuenho;
    private javax.swing.JLabel lblHistorialPlacas;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNumeroSerie;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JScrollPane panelHistorialPlacas;
    private javax.swing.JTable tblHistorialPlacas;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenho;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void cargarDatosResumen() {
        String nombreCompleto = this.generarNombreCompleto();
        this.txtDuenho.setText(nombreCompleto);

        Vehiculo vehiculo = this.confirmacionPlacasDTO.getAutomovil();
        this.txtNumeroSerie.setText(vehiculo.getNumeroSerie());
        this.txtMarca.setText(vehiculo.getMarca());
        this.txtLinea.setText(vehiculo.getLinea());
        this.txtColor.setText(vehiculo.getColor());

        this.cargarTablaHistorialPlacas();
    }

    private void vaciarTabla() {
        DefaultTableModel modeloTabla
                = (DefaultTableModel) this.tblHistorialPlacas.getModel();
        modeloTabla.setRowCount(0);
    }

    private void regresar() {
        FormUtils.regresar(this, this.frmAnterior);
    }

    private String generarNombreCompleto() {
        Persona tramitante = this.confirmacionPlacasDTO.getPersona();
        String nombres = tramitante.getNombres();
        String apellidoPaterno = tramitante.getApellidoPaterno();
        String apellidoMaterno = tramitante.getApellidoMaterno();
        if (apellidoMaterno == null) {
            apellidoMaterno = "";
        }

        return nombres + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    private void continuar() {
        JFrame cargar = new FrmTramitePlacasConfirmacion(
                this.confirmacionPlacasDTO,
                this);

        FormUtils.cargarForm(cargar, this);
    }

}
