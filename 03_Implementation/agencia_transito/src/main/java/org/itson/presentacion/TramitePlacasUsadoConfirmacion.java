package org.itson.presentacion;

import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.itson.daos.PlacasDAOImpl;
import org.itson.daos.VehiculosDAOImpl;
import org.itson.dominio.Automovil;
import org.itson.dominio.Persona;
import org.itson.dominio.Placa;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Vehiculo;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Toled
 */
public class TramitePlacasUsadoConfirmacion extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(TramitePlacasUsadoConfirmacion.class.getName());
    private final Vehiculo automovil;
    private final Persona persona;
    private final double costo;
    private final TipoPlaca tipo;
    private final String placas;

    public TramitePlacasUsadoConfirmacion(Persona persona, Vehiculo automovil, double costo, TipoPlaca tipo) {
        this.automovil = automovil;
        this.persona = persona;
        this.costo = costo;
        this.tipo = tipo;
        initComponents();
        String nombreCompleto = this.persona.getNombres() + " " + this.persona.getApellidoPaterno() + " " +this.persona.getApellidoMaterno();
        this.lblSerie.setText(this.automovil.getNumeroSerie());
        this.lblMarca.setText(this.automovil.getMarca());
        this.lblLinea.setText(this.automovil.getLinea());
        this.lblAnho.setText(this.automovil.getModelo());
        
        this.placas = cadenaPlacasPrimeraParte() + "-" + cadenaPlacasSegundaParte();
        this.lblPlacas.setText(placas);
        
        this.lblNombreCompleto.setText(nombreCompleto);
        this.lblCantidadCosto.setText(String.valueOf(this.costo));
    }
    
    private Placa obtenerPlaca(){
        GregorianCalendar fechaEmision = new GregorianCalendar();
        int diaRecepcion = fechaEmision.get(GregorianCalendar.DAY_OF_MONTH) + 3;
        GregorianCalendar fechaRecepcion = new GregorianCalendar(fechaEmision.get(GregorianCalendar.YEAR), fechaEmision.get(GregorianCalendar.MONTH), diaRecepcion);
        return new Placa(this.placas, fechaEmision, fechaRecepcion, this.tipo, this.automovil, this.costo, this.persona);
    }
    
    /**
     * Método que regresa una cadena de texto aleatoria de 16 dígitos.
     *
     * @return cadena Cadena de texto aleatoria.
     */
    private static String cadenaPlacasPrimeraParte() {
        // El banco de caracteres
        String placas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < 3; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, placas.length() - 1);
            char caracterAleatorio = placas.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    
    /**
     * Método que regresa una cadena de texto aleatoria de 16 dígitos.
     *
     * @return cadena Cadena de texto aleatoria.
     */
    private static String cadenaPlacasSegundaParte() {
        // El banco de caracteres
        String placas = "1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < 3; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, placas.length() - 1);
            char caracterAleatorio = placas.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    /**
     * Método que regresa un número entero aleatorio dentro de un rango.
     *
     * @param minimo Número entero con el mínimo del rango.
     * @param maximo Número entero con el máximo del rango.
     * @return número entero aleatorio.
     */
    private static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCantidadCosto = new javax.swing.JLabel();
        lblNombres5 = new javax.swing.JLabel();
        lblNombres7 = new javax.swing.JLabel();
        lblNombres8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblAnho = new javax.swing.JLabel();
        lblNombres10 = new javax.swing.JLabel();
        lblNombres11 = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblLinea = new javax.swing.JLabel();
        lblNombres15 = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        lblNombres12 = new javax.swing.JLabel();
        lblPlacas = new javax.swing.JLabel();

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
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

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

        btnAceptar.setBackground(new java.awt.Color(121, 90, 59));
        btnAceptar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        Background.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 30));

        btnCancelar.setBackground(new java.awt.Color(121, 90, 59));
        btnCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 30));

        lblCantidadCosto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblCantidadCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadCosto.setText("$Cantidad");
        Background.add(lblCantidadCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 110, 20));

        lblNombres5.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres5.setText("Perteneciente a:");
        Background.add(lblNombres5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 20));

        lblNombres7.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres7.setText("Placas para el automóvil con serie:");
        Background.add(lblNombres7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 280, 20));

        lblNombres8.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 21)); // NOI18N
        lblNombres8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres8.setText("Costo:");
        Background.add(lblNombres8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, 10));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 500, 10));

        lblAnho.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblAnho.setForeground(new java.awt.Color(255, 255, 255));
        lblAnho.setText("\"año\"");
        Background.add(lblAnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 20));

        lblNombres10.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres10.setText("Marca:");
        Background.add(lblNombres10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 20));

        lblNombres11.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres11.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres11.setText("Línea:");
        Background.add(lblNombres11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 50, 20));

        lblSerie.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblSerie.setText("\"serie\"");
        Background.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 150, 20));

        lblMarca.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("\"marca\"");
        Background.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 160, 20));

        lblLinea.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblLinea.setText("\"línea\"");
        Background.add(lblLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, 20));

        lblNombres15.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres15.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres15.setText("Modelo:");
        Background.add(lblNombres15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 20));

        lblNombreCompleto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCompleto.setText("\"nombres, apellidopa, apellidoma\"");
        Background.add(lblNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 330, 20));

        lblNombres12.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblNombres12.setForeground(new java.awt.Color(255, 255, 255));
        lblNombres12.setText("Placas nuevas:");
        Background.add(lblNombres12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 20));

        lblPlacas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        lblPlacas.setForeground(new java.awt.Color(255, 255, 255));
        lblPlacas.setText("\"placas\"");
        Background.add(lblPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 160, 20));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new TramitePlacasNuevo());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Placa placas = this.obtenerPlaca();
        PlacasDAOImpl tramite = new PlacasDAOImpl();
        try {
            tramite.save(placas);
            Dialogs.mostrarMensajeExito(rootPane, "Placa registrada exitosamente.");
            FormUtils.cargarForm(new MenuPrincipal(), this);
        } catch (PersistenciaException ex) {
            Logger.getLogger(RegistroAutomovil.class.getName()).log(Level.SEVERE, null, ex);
            Dialogs.mostrarMensajeError(rootPane, "No se pudo registrar la placa.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cancelar el registro?", "CANCELAR REGISTRO", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            FormUtils.cargarForm(new Tramites(), this);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblAnho;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblCantidadCosto;
    private javax.swing.JLabel lblLinea;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombres10;
    private javax.swing.JLabel lblNombres11;
    private javax.swing.JLabel lblNombres12;
    private javax.swing.JLabel lblNombres15;
    private javax.swing.JLabel lblNombres5;
    private javax.swing.JLabel lblNombres7;
    private javax.swing.JLabel lblNombres8;
    private javax.swing.JLabel lblPlacas;
    private javax.swing.JLabel lblSerie;
    // End of variables declaration//GEN-END:variables

    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
