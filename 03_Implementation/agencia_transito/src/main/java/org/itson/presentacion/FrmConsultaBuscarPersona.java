package org.itson.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.daos.PersonasDAOImpl;
import org.itson.dominio.Persona;
import org.itson.interfaces.PersonasDAO;
import org.itson.utils.BotonEditor;
import org.itson.utils.BotonRender;
import static org.itson.utils.Dialogs.mostrarMensajeError;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class FrmConsultaBuscarPersona extends JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmConsultaBuscarPersona.class.getName());
//    private final JFrame frmAnterior;

    /**
     * Unit of Work.
     */
    private UnitOfWork unitOfWork;

    /**
     * Constructor principal.
     */
    public FrmConsultaBuscarPersona() {
        this.unitOfWork = new UnitOfWork();
        initComponents();
        this.configurarTabla();

    }

    private void cargarTablaPersonas(final List<Persona> listaPersonas) {
        DefaultTableModel modeloTabla1
                = (DefaultTableModel) this.tblPersonas.getModel();
        modeloTabla1.setRowCount(0);
        for (Persona persona : listaPersonas) {
            Object[] fila = {
                persona.getRfc(),
                persona.getNombres(),
                persona.getApellidoPaterno(),
                persona.getApellidoMaterno(),
                persona.getFechaNacimiento()
            };
            modeloTabla1.addRow(fila);
        }

    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOperaciones = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        panelTablaCuentas = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtAnhoNacimiento = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblFechaNacimiento = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        rbtnAnhoNacimiento = new javax.swing.JRadioButton();
        rbtnRFC = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();
        txtNombre1 = new javax.swing.JTextField();

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
        lblOperaciones.setText("Buscar Persona");
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

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RFC", "Nombres", "Apellido P.", "Apellido M.", "Fecha Nacimiento", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonas.setColumnSelectionAllowed(true);
        panelTablaCuentas.setViewportView(tblPersonas);
        tblPersonas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblPersonas.getColumnModel().getColumnCount() > 0) {
            tblPersonas.getColumnModel().getColumn(0).setResizable(false);
            tblPersonas.getColumnModel().getColumn(1).setResizable(false);
            tblPersonas.getColumnModel().getColumn(2).setResizable(false);
            tblPersonas.getColumnModel().getColumn(3).setResizable(false);
            tblPersonas.getColumnModel().getColumn(4).setResizable(false);
            tblPersonas.getColumnModel().getColumn(5).setResizable(false);
            tblPersonas.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        Background.add(panelTablaCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 560, 190));

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
        Background.add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 30, 30));

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
        Background.add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 30, 30));

        lblRFC.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblRFC.setForeground(new java.awt.Color(255, 255, 255));
        lblRFC.setText("RFC");
        Background.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtRFC.setForeground(new java.awt.Color(51, 51, 51));
        txtRFC.setToolTipText("");
        txtRFC.setBorder(null);
        Background.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 10));

        lblNombre.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        txtAnhoNacimiento.setForeground(new java.awt.Color(51, 51, 51));
        txtAnhoNacimiento.setToolTipText("");
        txtAnhoNacimiento.setBorder(null);
        Background.add(txtAnhoNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 130, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, 10));

        lblFechaNacimiento.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Año de nacimiento");
        Background.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 180, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 10));

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
        Background.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 30));

        rbtnAnhoNacimiento.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnAnhoNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 100, 30, -1));

        rbtnRFC.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 100, 30, -1));

        rbtnNombre.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 100, 30, -1));

        txtNombre1.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre1.setToolTipText("");
        txtNombre1.setBorder(null);
        Background.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 140, 20));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Dirige a la ventana anterior.
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
     * Avanza en la pagina de operaciones.
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed

    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones.
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed


    }//GEN-LAST:event_btnRetrocederActionPerformed

    /**
     * Regresa al Frame anterior.
     *
     * @param evt
     */
    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new FrmMenuConsultas());
    }//GEN-LAST:event_btnRegresarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JRadioButton rbtnAnhoNacimiento;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JRadioButton rbtnRFC;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtAnhoNacimiento;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void configurarTabla() {
        botones.add(rbtnRFC);
        botones.add(rbtnNombre);
        botones.add(rbtnAnhoNacimiento);

        final int columnaBoton = 5;
        BotonEditor botonEditor
                = new BotonEditor(this, this.unitOfWork, this.tblPersonas);
        tblPersonas.getColumnModel()
                .getColumn(columnaBoton)
                .setCellEditor(botonEditor);

        BotonRender botonRender = new BotonRender();
        tblPersonas.getColumnModel()
                .getColumn(columnaBoton)
                .setCellRenderer(botonRender);

        List<Persona> listaPersonas = this.unitOfWork.personasDAO().getAll();
        cargarTablaPersonas(listaPersonas);
    }

    private void buscar() {

        List<Persona> listaPersonas = new ArrayList<>();

        if (!this.hayFiltrosSeleccionados()) {
            mostrarMensajeError(rootPane, "Seleccione un filtro.");
            return;
        }

        if (this.rbtnRFC.isSelected()) {
            String rfc = this.txtRFC.getText();
            Optional<Persona> optPersona
                    = this.unitOfWork.personasDAO().getByRFC(rfc);
            if (optPersona.isPresent()) {
                listaPersonas.add(optPersona.get());
            }
        }

        if (this.rbtnNombre.isSelected()) {
            String nombre = this.txtNombre1.getText();
            List<Persona> personasConsultadas
                    = this.unitOfWork.personasDAO().getByNombre(nombre);

            listaPersonas.addAll(personasConsultadas);
        }

        if (this.rbtnAnhoNacimiento.isSelected()) {
            Integer anho = Integer.valueOf(this.txtAnhoNacimiento.getText());
            List<Persona> personasConsultadas
                    = this.unitOfWork.personasDAO().getByAnho(anho);

            listaPersonas.addAll(personasConsultadas);
        }

        if (listaPersonas.isEmpty()) {
            mostrarMensajeError(rootPane, "No se encontraron registros.");
            return;
        }

        this.cargarTablaPersonas(listaPersonas);
    }

    private boolean hayFiltrosSeleccionados() {
        return this.rbtnAnhoNacimiento.isSelected()
                || this.rbtnNombre.isSelected()
                || this.rbtnRFC.isSelected();
    }
}
