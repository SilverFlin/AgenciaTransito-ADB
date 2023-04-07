package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.JFrame;
import org.itson.utils.*;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class ConsultaBuscarPersona extends JFrame {

//    private static final Logger LOG = Logger.getLogger(ConsultaBuscarPersona.class.getName());
//    private final JFrame frmAnterior;

    public ConsultaBuscarPersona() {
        initComponents();
        botones.add(rbtnRFC);
        botones.add(rbtnNombre);
        botones.add(rbtnFechaNacimiento);
        tblPersonas.getColumnModel().getColumn(5).setCellEditor(new BotonEditor(this));
        tblPersonas.getColumnModel().getColumn(5).setCellRenderer(new BotonRender());
        cargarTablaX();
//        this.frmAnterior = frmAnterior;
    }

    private void cargarTablaX() {
        //        List<Publicacion> listaPublicaciones
        //                = this.conseguirListaPublicaciones();
        //        DefaultTableModel modeloTabla
        //                = (DefaultTableModel) this.tblPublicaciones.getModel();
        //        modeloTabla.setRowCount(0);
        //        for (Publicacion publicacion : listaPublicaciones) {
        //            Object[] fila = {
        //                publicacion.getTitulo(),
        //        publicacion.getAutor().getNombre() + " ";
        //                + publicacion.getAutor().getApellidoPaterno(),
        //                publicacion.getNoPaginas(),
        //                "$" + publicacion.getCostoProd(),
        //                "$" + publicacion.getCostoVenta()};
        //
        //            modeloTabla.addRow(fila);
        //        };

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOperaciones = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        panelTablaCuentas = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblFechaNacimiento = new javax.swing.JLabel();
        dtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator6 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        rbtnFechaNacimiento = new javax.swing.JRadioButton();
        rbtnRFC = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();

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

        btnAtras1.setBackground(new java.awt.Color(102, 10, 10));
        btnAtras1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnAtras1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras1.setText("Regresar");
        btnAtras1.setBorder(null);
        btnAtras1.setBorderPainted(false);
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 40));

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
        Background.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtRFC.setForeground(new java.awt.Color(51, 51, 51));
        txtRFC.setToolTipText("");
        txtRFC.setBorder(null);
        Background.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 150, 10));

        lblNombre.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        Background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        Background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 150, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 10));

        lblFechaNacimiento.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setText("Fecha de Nacimiento");
        Background.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 180, 20));
        Background.add(dtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 130, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, 10));

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

        rbtnFechaNacimiento.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        rbtnRFC.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        rbtnNombre.setBackground(new java.awt.Color(173, 139, 106));
        Background.add(rbtnNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

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
//        this.regresar();
    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
     * Avanza en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        // TODO paginado
        this.cargarTablaX();
    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO paginado
        // this.configPaginado.retrocederPag();
        this.cargarTablaX();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtras1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRetroceder;
    private com.toedter.calendar.JDateChooser dtFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JRadioButton rbtnFechaNacimiento;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JRadioButton rbtnRFC;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables

//    private void regresar() {
//        FormUtils.regresar(frmAnterior, this);
//    }
}
