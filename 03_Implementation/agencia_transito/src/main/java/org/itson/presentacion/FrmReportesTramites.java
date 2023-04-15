package org.itson.presentacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import org.itson.daos.ParametrosTramitesDTO;
import org.itson.daos.TramitesDAOImpl;
import org.itson.dominio.Licencia;
import org.itson.dominio.Persona;
import org.itson.dominio.Placa;
import org.itson.dominio.Tramite;
import org.itson.utils.ConfiguracionPaginado;
import org.itson.utils.Dialogs;
import org.itson.utils.Fecha;
import org.itson.utils.FormUtils;
import org.itson.utils.Formateador;
import org.itson.utils.JasperByCollectionBeanData;
import org.itson.utils.Periodo;

/**
 *
 * @author Toled
 */
public class FrmReportesTramites extends JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmReportesTramites.class.getName());

    /**
     * Dao necesario.
     */
    private TramitesDAOImpl tramitesDAO;

    /**
     * Unit of Work, que contiene todos los daos.
     */
    private final UnitOfWork unitOfWork = new UnitOfWork();
    /**
     * Formateador de fecha, con formato dd/MM/yyy.
     */
    private final DateFormat formateador = new SimpleDateFormat("dd/MM/yyy");
    /**
     * Configuración del paginado para la tabla personas.
     */
    private ConfiguracionPaginado paginado;

    /**
     * Constructor principal.
     */
    public FrmReportesTramites() {
        initComponents();
        this.configurarPaginado();
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
                "Tipo", "Tramitante", "Costo", "Fecha expedición"
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

        Background.add(panelTablaCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 560, 180));

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
        Background.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 10));

        lblNombre.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        Background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 10));

        lblFin.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblFin.setForeground(new java.awt.Color(255, 255, 255));
        lblFin.setText("Fin");
        Background.add(lblFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, 20));
        Background.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 10));

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
        Background.add(rbtnPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        rbtnTipo.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        rbtnNombre.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licencia", "Placa" }));
        Background.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 20));
        Background.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, 10));

        lblPeriodo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setText("Periodo");
        Background.add(lblPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, 20));

        lblInicio.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicio");
        Background.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 50, 20));

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
    @SuppressWarnings("all")
    private void btnCrearPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPDFActionPerformed
        this.crearPdf();
    }//GEN-LAST:event_btnCrearPDFActionPerformed

    /**
     * Avanza en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        this.avanzarPagina();
    }//GEN-LAST:event_btnAdelanteActionPerformed

    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        this.retrocederPagina();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
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
    //CHECKSTYLE:ON

    private List<Tramite> obtenerListaTramitesPaginado() {
        if (!this.hayFiltroSeleccionado()) {
            String msgError = "No hay seleccionado ningún filtro.";
            Dialogs.mostrarMensajeError(rootPane, msgError);
            return null;
        }
        ParametrosTramitesDTO parametros = this.conseguirParametros();
        if (parametros != null) {
            return unitOfWork.tramitesDAO().getAll(parametros, paginado);
        } else {
            return new ArrayList<>();
        }

    }

    private List<Tramite> obtenerTodosTramites() {
        if (!this.hayFiltroSeleccionado()) {
            String msgError = "No hay seleccionado ningún filtro.";
            Dialogs.mostrarMensajeError(rootPane, msgError);
            return null;
        }

        ParametrosTramitesDTO parametros = this.conseguirParametros();
        if (parametros != null) {
            return unitOfWork.tramitesDAO().getAll(parametros);
        } else {
            return new ArrayList<>();
        }
    }

    private void buscar() {
        DefaultTableModel modeloTabla
                = (DefaultTableModel) this.tblTramites.getModel();
        this.limpiarTabla(modeloTabla);
        List<Tramite> listaTramites = this.obtenerListaTramitesPaginado();
        cargarTablaTramites(listaTramites);
    }

    private void cargarTablaTramites(final List<Tramite> listaTramites) {

        if (listaTramites == null) {
            return;
        }

        if (listaTramites.isEmpty()) {
            this.paginado.retrocederPag();
            return;
        }

        DefaultTableModel modeloTabla
                = (DefaultTableModel) this.tblTramites.getModel();
        this.limpiarTabla(modeloTabla);

        for (Tramite tramite : listaTramites) {

            String nombreCompleto
                    = this.getNombreCompleto(tramite.getTramitante());

            Object[] fila = {
                tramite.getClass().getSimpleName(),
                nombreCompleto,
                Formateador.formatoDinero(tramite.getCosto()),
                formatoFecha(tramite.getFechaInicio())
            };
            modeloTabla.addRow(fila);
        }

    }

    private void regresar() {
        FormUtils.regresar(this, new FrmReportes());
    }

    private ParametrosTramitesDTO conseguirParametros() {
        ParametrosTramitesDTO params;

        if (rbtnTipo.isSelected()) {
            Class<? extends Tramite> tipo = this.getTipo();
            params = new ParametrosTramitesDTO(tipo);
        } else {
            params = new ParametrosTramitesDTO(Tramite.class);
        }

        if (this.rbtnNombre.isSelected()) {
            String nombre = txtNombre.getText();
            params.setNombreTramitante(nombre);
        }

        if (this.rbtnPeriodo.isSelected()) {
            Calendar calendarInicio = txtFechaInicio.getCalendar();
            Calendar calendarFin = txtFechaFin.getCalendar();
            if (calendarFin == null || calendarInicio == null) {
                String msgError = "Selecciona el periodo";
                Dialogs.mostrarMensajeError(rootPane, msgError);
                return null;
            }

            if (calendarInicio.after(calendarFin)) {
                String msgError = "Fecha fin debe ir después de fecha inicio";
                Dialogs.mostrarMensajeError(rootPane, msgError);
                return null;
            }

            Fecha fechaInicio = new Fecha((GregorianCalendar) calendarInicio);
            Fecha fechaFin = new Fecha((GregorianCalendar) calendarFin);

            Periodo periodo = new Periodo(fechaInicio, fechaFin);
            params.setPeriodo(periodo);
        }

        return params;
    }

    private boolean hayFiltroSeleccionado() {
        return this.rbtnTipo.isSelected()
                || this.rbtnPeriodo.isSelected()
                || this.rbtnNombre.isSelected();
    }

    private Class<? extends Tramite> getTipo() {
        String tipo = FormUtils.getItemComboBox(cbxTipo);
        if ("Licencia".equals(tipo)) {
            return Licencia.class;
        } else if ("Placa".equals(tipo)) {
            return Placa.class;
        } else {
            throw new IllegalStateException();
        }
    }

    private void limpiarTabla(final DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
    }

    private String getNombreCompleto(final Persona tramitante) {
        return tramitante.getNombres() + " "
                + tramitante.getApellidoPaterno() + " "
                + (tramitante.getApellidoMaterno() == null
                ? "" : tramitante.getApellidoMaterno());
    }

    private String formatoFecha(final Calendar calendar) {
        return formateador.format(calendar.getTime());
    }

    private void configurarPaginado() {
        final int limite = this.tblTramites.getModel().getRowCount();
        final int pagInicial = 0;
        paginado = new ConfiguracionPaginado(limite, pagInicial);
    }

    private void retrocederPagina() {
        this.paginado.retrocederPag();
        this.cargarTablaTramites(obtenerListaTramitesPaginado());
    }

    private void avanzarPagina() {
        this.paginado.avanzarPag();
        this.cargarTablaTramites(obtenerListaTramitesPaginado());
    }

    private void crearPdf() {
        List<Tramite> listaTramites = this.obtenerTodosTramites();
        System.out.println(listaTramites.size());

        if (listaTramites == null || listaTramites.isEmpty()) {
            Dialogs.mostrarMensajeError(this, "La tabla está vacía.");
        }

        List<ReporteTramiteDTO> reporteTramites = new ArrayList<>();

        for (Tramite tramite : listaTramites) {
            ReporteTramiteDTO reporte = this.generarReporte(tramite);
            reporteTramites.add(reporte);
        }

        try {
            JasperByCollectionBeanData.crearPDF(reporteTramites);
        } catch (JRException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }

    }

    private ReporteTramiteDTO generarReporte(final Tramite tramite) {
        String nombreCompleto = this.getNombreCompleto(tramite.getTramitante());
        String tipo = tramite.getClass().getSimpleName();
        String costo = Formateador.formatoDinero(tramite.getCosto());
        String fecha = formatoFecha(tramite.getFechaInicio());

        return new ReporteTramiteDTO(tipo, nombreCompleto, costo, fecha);
    }
}
