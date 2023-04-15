package org.itson.presentacion;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.Dialogs;
import org.itson.utils.FormUtils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class FrmRegistros extends javax.swing.JFrame {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmRegistros.class.getName());

    /**
     * Constructor principal.
     */
    public FrmRegistros() {
        initComponents();
    }

    private void registrarPersonas() throws PersistenciaException {
        UnitOfWork unit = new UnitOfWork();
        
        Persona p1 = new Persona("MAPM0305271M1", "Misael", "Marchena", "Pérez", new GregorianCalendar(2003, 4, 27), "6442322888");
        Persona p2 = new Persona("TORL0311112T2", "Luis Angel", "Toledo", "Russo", new GregorianCalendar(2003, 10, 11), "6444276282");
        Persona p3 = new Persona("RAEM0303035M3", "Magda", "Ramirez", "Escalante", new GregorianCalendar(2003, 2, 3), "6441627364");
        Persona p4 = new Persona("DUQL0318119L2", "Luis Esteban", "Durán", "Quintanar", new GregorianCalendar(2003, 10, 18), "6441625374");
        Persona p5 = new Persona("GOPG0308227G7", "Gustavo", "Gómez", "Padilla", new GregorianCalendar(2003, 7, 22), "6444726332");
        Persona p6 = new Persona("PIGG0311217G7", "Grecia Zulema", "Picos", "Garcia", new GregorianCalendar(2003, 10, 21), "6441253652");
        Persona p7 = new Persona("HEIR0308160R9", "Rosario", "Hernández", "Itto", new GregorianCalendar(2003, 7, 16), "6442298602");
        Persona p8 = new Persona("ZAAD0306124H1", "Didier Neftali", "Zabalza", "Apodaca", new GregorianCalendar(2003, 5, 12), "6442287364");
        Persona p9 = new Persona("MAPA0104192A3", "Areymi", "Marchena", "Pérez", new GregorianCalendar(2001, 3, 19), "6441320985");
        Persona p10 = new Persona("BRLA0104192P1", "Abril", "Briceño", "Lopez", new GregorianCalendar(2001, 3, 19), "6442534671");
        Persona p11 = new Persona("GAEF0307290K3", "Fabian", "Garnica", "Escudero", new GregorianCalendar(2003, 6, 29), "6441982784");
        Persona p12 = new Persona("RISI0201029H5", "Ismael", "Rivera", "Soto", new GregorianCalendar(2002, 2, 2), "6444928746");
        Persona p13 = new Persona("CUAS8803143O3", "Stephen", "Curry", "Adams", new GregorianCalendar(1988, 2, 14), "6441625381");
        Persona p14 = new Persona("MERS9808087S7", "Shawn", "Mendes", "Rayment", new GregorianCalendar(1998, 7, 8), "6442987391");
        Persona p15 = new Persona("CRFR7106178J4", "Roberto", "Cruz", "Fernández", new GregorianCalendar(1971, 5, 17), "6441627301");
        Persona p16 = new Persona("MAPA1107279A1", "Amy Marsella", "Marchena", "Pérez", new GregorianCalendar(2011, 6, 27), "6444280581");
        Persona p17 = new Persona("PEVL9212138H4", "Leonardo", "Pérez", "Valenzuela", new GregorianCalendar(1992, 11, 13), "6441627018");
        Persona p18 = new Persona("PEVM8210218A5", "Marcela Arely", "Pérez", "Valenzuela", new GregorianCalendar(1982, 9, 21), "6442873917");
        Persona p19 = new Persona("ROBL0309198L5", "Luis Angel", "Rosas", "Bocardo", new GregorianCalendar(2003, 8, 19), "6442251672");
        Persona p20 = new Persona("VARH0111017H7", "Hazel", "Valerio", "Robles", new GregorianCalendar(2001, 10, 1), "6441289371");
        
        unit.personasDAO().save(p1);
        unit.personasDAO().save(p2);
        unit.personasDAO().save(p3);
        unit.personasDAO().save(p4);
        unit.personasDAO().save(p5);
        unit.personasDAO().save(p6);
        unit.personasDAO().save(p7);
        unit.personasDAO().save(p8);
        unit.personasDAO().save(p9);
        unit.personasDAO().save(p10);
        unit.personasDAO().save(p11);
        unit.personasDAO().save(p12);
        unit.personasDAO().save(p13);
        unit.personasDAO().save(p14);
        unit.personasDAO().save(p15);
        unit.personasDAO().save(p16);
        unit.personasDAO().save(p17);
        unit.personasDAO().save(p18);
        unit.personasDAO().save(p19);
        unit.personasDAO().save(p20);
        
    }

    @SuppressWarnings("all")
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

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FormUtils.regresar(this, new FrmMenuPrincipal());
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnRegistrarAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutomovilActionPerformed
        FormUtils.cargarForm(new FrmRegistroAutomovil(), this);
    }//GEN-LAST:event_btnRegistrarAutomovilActionPerformed

    @SuppressWarnings("all")
    private void btnRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonasActionPerformed
        try {
            this.registrarPersonas();
            Dialogs.mostrarMensajeExito(rootPane, "Se han registrado 20 personas exitosamente.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(FrmRegistros.class.getName()).log(Level.SEVERE, null, ex);
            Dialogs.mostrarMensajeExito(rootPane, "No se han podido registrar las 20 personas.");
        }
        
    }//GEN-LAST:event_btnRegistrarPersonasActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegistrarAutomovil;
    private javax.swing.JButton btnRegistrarPersonas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

}
