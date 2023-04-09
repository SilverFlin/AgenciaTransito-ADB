package org.itson.presentacion;

import java.sql.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.daos.TramitesDAOImpl;
import org.itson.dominio.Tramite;
import org.itson.utils.*;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class ReportesTramites extends JFrame {

    private static final Logger LOG = Logger.getLogger(ConsultaBuscarPersona.class.getName());
    private Date fechaInicio;
    private Date fechaFinal;
    private TramitesDAOImpl tramitesDAO;
    
    public ReportesTramites() {
        String fechaInicioNull = "2023-01-01", fechaFinalNull = "2023-12-31";
        this.fechaInicio = Date.valueOf(fechaInicioNull);
        this.fechaFinal = Date.valueOf(fechaFinalNull);
        this.tramitesDAO = new TramitesDAOImpl();
        initComponents();
        botones.add(rbtnTipo);
        botones.add(rbtnNombre);
        botones.add(rbtnPeriodo);
        this.txtFechaInicio.setDate(fechaInicio);
        this.txtFechaFin.setDate(fechaFinal);
        List<Tramite> listaTramites = this.tramitesDAO.consultarTramitesPeriodo(this.fechaInicio, this.fechaFinal);
        this.cargarTablaTramites(listaTramites);
    }

    private void cargarTablaTramites(List<Tramite> listaTramites) {
            DefaultTableModel modeloTabla1 = (DefaultTableModel) this.tblTramites.getModel();
            modeloTabla1.setRowCount(0);
            for (Tramite tramite : listaTramites) {
                Object[] fila = {tramite, tramite.getTramitante().getNombres(), tramite.getCosto(), tramite};
                modeloTabla1.addRow(fila);
            }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOperaciones = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        panelTablaCuentas = new javax.swing.JScrollPane();
        tblTramites = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblFin = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        jSeparator6 = new javax.swing.JSeparator();
        btnCrearPDF = new javax.swing.JButton();
        rbtnPeriodo = new javax.swing.JRadioButton();
        rbtnTipo = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();
        cbxTipo = new javax.swing.JComboBox<>();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        jSeparator7 = new javax.swing.JSeparator();
        lblPeriodo = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

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
        lblOperaciones.setText("Reporte de Trámites");
        jPanel1.add(lblOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

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

        tblTramites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombres de persona", "Costo", "Fecha realización"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTramites.setColumnSelectionAllowed(true);
        panelTablaCuentas.setViewportView(tblTramites);
        tblTramites.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblTramites.getColumnModel().getColumnCount() > 0) {
            tblTramites.getColumnModel().getColumn(5).setMinWidth(50);
            tblTramites.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblTramites.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        Background.add(panelTablaCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 560, 190));

        btnAdelante.setBackground(new java.awt.Color(102, 10, 10));
        btnAdelante.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAdelante.setForeground(new java.awt.Color(255, 255, 255));
        btnAdelante.setText(">");
        btnAdelante.setBorder(null);
        btnAdelante.setBorderPainted(false);
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        Background.add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 30, 30));

        btnRetroceder.setBackground(new java.awt.Color(102, 10, 10));
        btnRetroceder.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setText("<");
        btnRetroceder.setBorder(null);
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        Background.add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 30, 30));

        lblTipo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo de trámite");
        Background.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 10));

        lblNombre.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        Background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, 10));

        lblFin.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblFin.setForeground(new java.awt.Color(255, 255, 255));
        lblFin.setText("Fin");
        Background.add(lblFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 50, 20));
        Background.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, 10));

        btnCrearPDF.setBackground(new java.awt.Color(102, 10, 10));
        btnCrearPDF.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnCrearPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearPDF.setText("Crear PDF");
        btnCrearPDF.setBorder(null);
        btnCrearPDF.setBorderPainted(false);
        btnCrearPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPDFActionPerformed(evt);
            }
        });
        Background.add(btnCrearPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 90, 30));

        rbtnPeriodo.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        rbtnTipo.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        rbtnNombre.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licencia", "Placa" }));
        Background.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 20));
        Background.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 80, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 80, 10));

        lblPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setText("Periodo");
        Background.add(lblPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 20));

        lblInicio.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicio");
        Background.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 50, 20));

        btnBuscar.setBackground(new java.awt.Color(102, 10, 10));
        btnBuscar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        Background.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 70, 30));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Dirige a la ventana anterior
     *
     * @param evt Evento que lo acciono
     */
    private void btnCrearPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPDFActionPerformed
        
    }//GEN-LAST:event_btnCrearPDFActionPerformed
    /**
     * Avanza en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        
    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new Reportes());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Tramite> listaTramites;
        if (this.rbtnTipo.isSelected()){
            listaTramites = this.tramitesDAO.consultarLista(this.cuentaIniciada.getNumeroCuenta(), this.fechaInicio, this.fechaFinal);
            this.cargarTablaTramites(listaTramites);
        } else if (this.rbtnNombre.isSelected()){
            listaTramites = this.tramitesDAO.consultarLista(this.cuentaIniciada.getNumeroCuenta(), this.fechaInicio, this.fechaFinal);
            this.cargarTablaTramites(listaTramites);
        } else if (this.rbtnPeriodo.isSelected()){
            listaTramites = this.tramitesDAO.consultarLista(this.cuentaIniciada.getNumeroCuenta(), this.fechaInicio, this.fechaFinal);
            this.cargarTablaTramites(listaTramites);
        } else {
            Dialogs.mostrarMensajeError(rootPane, "Seleccione un filtro de búsqueda.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearPDF;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JRadioButton rbtnPeriodo;
    private javax.swing.JRadioButton rbtnTipo;
    private javax.swing.JTable tblTramites;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

//    private void regresar() {
//        FormUtils.regresar(frmAnterior, this);
//    }
}
