/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.temptest;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import org.itson.daos.DAO;
import org.itson.daos.PersonasDAO;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import static org.itson.main.Main.getRandomNumber;
import static org.itson.main.Main.imprimirLista;

/**
 *
 * @author Toled
 */
public class TestPersonasDAO {

    public static void probarPersonasDAO() {
        System.out.println("Agregar Persona falsa:");
        agregaPersonaFalsa();
        System.out.println("\nConsultar Personas");
        imprimirLista(consultaPersonas());
        System.out.println("\nConsultar persona id=1:");
        System.out.println(consultaPrimerPersona());
    }

    public static Persona agregaPersonaFalsa() {
        Persona persona = crearPersonaFalsa();
        DAO personasDAO = new PersonasDAO();
        try {
            return (Persona) personasDAO.save(persona);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
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

    private static Optional consultaPrimerPersona() {
        DAO personasDAO = new PersonasDAO();
        return personasDAO.get(1);
    }

    private static String getRandomRFC() {
        return getRandomNumber(13);
    }

    private static List<Persona> consultaPersonas() {
        DAO personasDAO = new PersonasDAO();
        return personasDAO.getAll();
    }
}
