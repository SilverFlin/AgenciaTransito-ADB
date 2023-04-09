package org.itson.presentacion;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.daos.PersonasDAOImpl;
import org.itson.dominio.Persona;
import org.itson.utils.*;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class ConsultaBuscarPersona extends JFrame {

//    private static final Logger LOG = Logger.getLogger(ConsultaBuscarPersona.class.getName());
//    private final JFrame frmAnterior;
    private PersonasDAOImpl personasDAO;
    
    public ConsultaBuscarPersona() {
        initComponents();
        botones.add(rbtnRFC);
        botones.add(rbtnNombre);
        botones.add(rbtnAnhoNacimiento);
        tblPersonas.getColumnModel().getColumn(5).setCellEditor(new BotonEditor(this));
        tblPersonas.getColumnModel().getColumn(5).setCellRenderer(new BotonRender());
        List<Persona> listaPersonas = this.personasDAO.getAll();
        cargarTablaPersonas(listaPersonas);
    }

    private void cargarTablaPersonas(List<Persona> listaPersonas) {
        DefaultTableModel modeloTabla1 = (DefaultTableModel) this.tblPersonas.getModel();
        modeloTabla1.setRowCount(0);
        for (Persona persona : listaPersonas) {
            Object[] fila = {persona.getRfc(), persona.getNombres(), persona.getApellidoPaterno(), persona.getApellidoMaterno(), persona.getFechaNacimiento()};
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
                false, false, false, false, false, false
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
            tblPersonas.getColumnModel().getColumn(5).setMinWidth(50);
            tblPersonas.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblPersonas.getColumnModel().getColumn(5).setMaxWidth(50);
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
     * Dirige a la ventana anterior
     *
     * @param evt Evento que lo acciono
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Persona> listaPersonas = null;
        if (this.rbtnRFC.isSelected()) {
            Optional<Persona> persona = this.personasDAO.getByRFC(this.txtRFC.getText());
            listaPersonas.add(persona.get());
            this.cargarTablaPersonas(listaPersonas);
        } else if (this.rbtnNombre.isSelected()) {
            listaPersonas = this.personasDAO.getByNombre(this.txtNombre1.getText());
            this.cargarTablaPersonas(listaPersonas);
        } else if (this.rbtnAnhoNacimiento.isSelected()) {
            listaPersonas = this.personasDAO.getByAnho(Integer.parseInt(this.txtAnhoNacimiento.getText()));
            this.cargarTablaPersonas(listaPersonas);
        } else {
            Dialogs.mostrarMensajeError(rootPane, "Seleccione un filtro de búsqueda.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
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
        FormUtils.regresar(this, new Consultas());
    }//GEN-LAST:event_btnRegresarActionPerformed


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

}
