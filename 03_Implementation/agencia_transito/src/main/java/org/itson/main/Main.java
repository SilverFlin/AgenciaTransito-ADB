/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.daos.DAO;
import org.itson.daos.PersonasDAO;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        probarPersoansDAO();
    }

    // Pseudo-pruebas 
    // TODO pasar a unit test
    public static void probarPersoansDAO() {
        System.out.println("Agregar Persona falsa:");
        agregaPersonaFalsa();
        System.out.println("\nConsultar Personas");
        consultaPersonas();
        System.out.println("\nConsultar persona id=1:");
        consultaPrimerPersona();
    }

    public static void consultaPersonas() {
        DAO personasDAO = new PersonasDAO();
        List<Persona> personas = personasDAO.getAll();
        imprimirLista(personas);
    }

    public static void consultaPrimerPersona() {
        DAO personasDAO = new PersonasDAO();
        Optional persona = personasDAO.get(1);
        System.out.println(persona);
    }

    public static void agregaPersonaFalsa() {
        Persona persona = crearPersonaFalsa();
        DAO personasDAO = new PersonasDAO();
        try {
            personasDAO.save(persona);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static <T> void imprimirLista(List<T> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    private static Persona crearPersonaFalsa() {
        Persona persona = new Persona();
        persona.setNombres("Jedal");
        persona.setApellidoPaterno("Lestibournes");
        persona.setApellidoMaterno("The TinEye");

        persona.setFechaNacimiento(new GregorianCalendar(1007, 12, 6));
        persona.setRFC(getRandomNumber(13));
        persona.setTelefono("123123123");

        return persona;
    }

    public static String getRandomNumber(int digCount) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(digCount);
        for (int i = 0; i < digCount; i++) {
            sb.append((char) ('0' + rnd.nextInt(10)));
        }
        return sb.toString();
    }

    public static String getRandomRFC() {
        return getRandomNumber(13);
    }
}
