package org.itson.presentacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.itson.dominio.Persona;
import org.itson.dominio.Tramite;
import org.itson.utils.FormUtils;
import static org.itson.utils.Formateador.formatoDinero;

/**
 *
 * @author Toled
 */
public class FrmTramitesPersona extends JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmTramitesPersona.class.getName());

    /**
     * Unit of Work.
     */
    private UnitOfWork unitOfWork;

    /**
     * Persona tramitante.
     */
    private Persona tramitante;
    /**
     * Lista de tramitantes.
     */
    private List<Tramite> listaTramites;

    /**
     * Formateador de fecha, con formato dd/MM/yyy.
     */
    private final DateFormat formateador = new SimpleDateFormat("dd/MM/yyy");

    /**
     * Constructor principal del Frame.
     *
     * @param persona
     * @param unitOfWork
     */
    public FrmTramitesPersona(
            final Persona persona,
            final UnitOfWork unitOfWork
    ) {
        try {
            this.tramitante = persona;
            this.unitOfWork = unitOfWork;
            initComponents();
            this.actualizarListaTramites();
            this.cargarNombreTramitante();
            this.cargarTablaTramitesPersona();
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Error al cargar Frame");
            this.regresar();
        }

    }

    private void cargarTablaTramitesPersona() {

        this.vaciarTabla();
        this.actualizarListaTramites();
        DefaultTableModel modeloTabla
                = (DefaultTableModel) this.tblTramitesRealizados.getModel();

        // TODO(Luis): remover id
        for (Tramite tramite : this.listaTramites) {
            String tipo = tramite.getClass().getSimpleName();
            String costo = formatoDinero(tramite.getCosto());
            String fecha = formatoFecha(tramite.getFechaInicio());
            Object[] fila = {tipo, costo, fecha};
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
        panelTablaCuentas = new javax.swing.JScrollPane();
        tblTramitesRealizados = new javax.swing.JTable();
        btnAdelante = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        lblNombres7 = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();

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
        lblOperaciones.setText("Trámites Realizados");
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

        tblTramitesRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Costo", "Fecha de realización"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTramitesRealizados.setColumnSelectionAllowed(true);
        panelTablaCuentas.setViewportView(tblTramitesRealizados);
        tblTramitesRealizados.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        lblNombres7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres7.setText("Trámites de:");
        Background.add(lblNombres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 20));

        lblNombreCompleto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCompleto.setText("\"nombres, apellidopa, apellidoma\"");
        Background.add(lblNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 310, 20));

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

        // TODO
    }//GEN-LAST:event_btnAdelanteActionPerformed
    /**
     * Retrocede en la pagina de operaciones
     *
     * @param evt Evento que lo acciono
     */
    @SuppressWarnings("all")
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO
    }//GEN-LAST:event_btnRetrocederActionPerformed

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        try {
            this.regresar();
        } catch (Exception e) {
            // TODO(Luis): cambiar msg a constantes
            LOG.log(Level.SEVERE, "Error al regresar form");
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombres7;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JScrollPane panelTablaCuentas;
    private javax.swing.JTable tblTramitesRealizados;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void cargarNombreTramitante() {
        String nombres = this.tramitante.getNombres();
        String apellidoPaterno = this.tramitante.getApellidoPaterno();
        String apellidoMaterno
                = (this.tramitante.getApellidoMaterno() == null)
                ? "" : this.tramitante.getApellidoMaterno();
        String nombreCompleto
                = nombres + " "
                + apellidoPaterno + " "
                + apellidoMaterno;
        this.lblNombreCompleto.setText(nombreCompleto);
    }

    private void vaciarTabla() {
        DefaultTableModel modeloTabla
                = (DefaultTableModel) this.tblTramitesRealizados.getModel();
        modeloTabla.setRowCount(0);
    }

    private void actualizarListaTramites() {
        Optional<Persona> optPersona
                = unitOfWork
                        .personasDAO()
                        .get(this.tramitante.getId());

        if (optPersona.isPresent()) {
            Persona persona = optPersona.get();
            this.listaTramites = persona.getTramites();
        }

    }

    private String formatoFecha(final Calendar calendar) {
        return formateador.format(calendar.getTime());
    }

    private void regresar() {
        FormUtils.regresar(this, new FrmConsultaBuscarPersona());
    }

}
