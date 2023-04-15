package org.itson.presentacion;

import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class FrmHistorialPlacas extends JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmHistorialPlacas.class.getName());
//    private final JFrame frmAnterior;

    /**
     * Constructor principal.
     */
    public FrmHistorialPlacas() {
        initComponents();
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

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblOperaciones = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        panelTablaCuentas = new javax.swing.JScrollPane();
        tblHistorialPlacas = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();

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
        lblOperaciones.setText("Historial Placas");
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Matricula", "Fecha Emision", "Tipo", "ID Persona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistorialPlacas.setColumnSelectionAllowed(true);
        panelTablaCuentas.setViewportView(tblHistorialPlacas);
        tblHistorialPlacas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Avanza en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        // TODO paginado
        this.cargarTablaX();
    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO paginado
        // this.configPaginado.retrocederPag();
        this.cargarTablaX();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JTable tblHistorialPlacas;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void regresar() {
//        FormUtils.regresar(frmAnterior, this);
    }
}
