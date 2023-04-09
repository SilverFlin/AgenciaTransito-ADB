package org.itson.presentacion;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.dominio.Persona;
import org.itson.daos.PersonasDAOImpl;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.*;

/**
 *
 * @author Toled
 */
public class Registros extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(Registros.class.getName());

    public Registros() {
        initComponents();
    }

    private void registrarPersonas() throws PersistenciaException {
        Persona p1 = new Persona("MAPM0305271M1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p2 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p3 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p4 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p5 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p6 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p7 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p8 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p9 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p10 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p11 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p12 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p13 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p14 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p15 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p16 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p17 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p18 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p19 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));
        Persona p20 = new Persona("MAOS2047152H1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 05, 27));

        PersonasDAOImpl personas = new PersonasDAOImpl();
        personas.save(p1);
        personas.save(p2);
        personas.save(p3);
        personas.save(p4);
        personas.save(p5);
        personas.save(p6);
        personas.save(p7);
        personas.save(p8);
        personas.save(p9);
        personas.save(p10);
        personas.save(p11);
        personas.save(p12);
        personas.save(p13);
        personas.save(p14);
        personas.save(p15);
        personas.save(p16);
        personas.save(p17);
        personas.save(p18);
        personas.save(p19);
        personas.save(p20);
    }

    private boolean validarRegistros() {
        PersonasDAOImpl personas = new PersonasDAOImpl();
        if (personas.getAll() == null) {
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrarAutomovil = new javax.swing.JButton();
        btnRegistrarPersonas = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
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
        lblBienvenido.setText("Registros");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

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

        btnRegistrarAutomovil.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarAutomovil.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnRegistrarAutomovil.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutomovil.setText("Registrar Automóvil");
        btnRegistrarAutomovil.setBorder(null);
        btnRegistrarAutomovil.setBorderPainted(false);
        btnRegistrarAutomovil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutomovilActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, 70));

        btnRegistrarPersonas.setBackground(new java.awt.Color(121, 90, 59));
        btnRegistrarPersonas.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnRegistrarPersonas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonas.setText("Registrar Personas");
        btnRegistrarPersonas.setBorder(null);
        btnRegistrarPersonas.setBorderPainted(false);
        btnRegistrarPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonasActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 260, 70));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new MenuPrincipal());
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutomovilActionPerformed
        FormUtils.cargarForm(new RegistroAutomovil(), this);
    }//GEN-LAST:event_btnRegistrarAutomovilActionPerformed

    private void btnRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonasActionPerformed
        if (validarRegistros()) {
            try {
                registrarPersonas();
                Dialogs.mostrarMensajeExito(rootPane, "Se han registrado 20 personas exitosamente.");
            } catch (PersistenciaException ex) {
                Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
                Dialogs.mostrarMensajeError(rootPane, "No se pudieron registrar las 20 personas.");
            }
        } else {
            Dialogs.mostrarMensajeError(rootPane, "Ya se han registrado las 20 personas.");
        }
    }//GEN-LAST:event_btnRegistrarPersonasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrarAutomovil;
    private javax.swing.JButton btnRegistrarPersonas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables

}
