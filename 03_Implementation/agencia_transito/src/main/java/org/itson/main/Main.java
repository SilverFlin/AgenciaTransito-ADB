/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.itson.daos.DAO;
import org.itson.daos.PersonasDAO;
import org.itson.daos.VehiculosDAO;
import org.itson.dominio.Automovil;
import org.itson.dominio.Persona;
import org.itson.dominio.Vehiculo;
import org.itson.excepciones.PersistenciaException;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        probarVehiculosDAO();
    }

    // Pseudo-pruebas 
    // TODO pasar a unit test
    public static void probarPersonasDAO() {
        System.out.println("Agregar Persona falsa:");
        agregaPersonaFalsa();
        System.out.println("\nConsultar Personas");
        imprimirLista(consultaPersonas());
        System.out.println("\nConsultar persona id=1:");
        System.out.println(consultaPrimerPersona());
    }

    public static void probarVehiculosDAO() {
        System.out.println("Agregar Vehiculo falso:");
        agregaVehiculoFalso();
        System.out.println("\nConsultar Vehiculos");
        imprimirLista(consultaVehiculos());
        System.out.println("\nConsultar vehiculo id=1:");
        System.out.println(consultaPrimerVehiculo());
    }

    public static List<Persona> consultaPersonas() {
        DAO personasDAO = new PersonasDAO();
        return personasDAO.getAll();
    }

    public static Optional consultaPrimerPersona() {
        DAO personasDAO = new PersonasDAO();
        return personasDAO.get(1);
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

    public static String getRandomRFC() {
        return getRandomNumber(13);
    }

    public static String getRandomPlaca() {
        return getRandomNumber(3) + "-" + getRandomNumber(3);
    }

    public static String getRandomNoSerie() {
        return getRandomNumber(17);
    }

    public static Vehiculo agregaVehiculoFalso() {

        Vehiculo vehiculo = crearVehiculoFalso();
        DAO vehiculosDAO = new VehiculosDAO();
        try {
            return (Vehiculo) vehiculosDAO.save(vehiculo);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    public static Vehiculo crearVehiculoFalso() {
        Vehiculo automovil = new Automovil();
        automovil.setColor("Azul");
        automovil.setDuenho(agregaPersonaFalsa());
        automovil.setLinea("Linea");
        automovil.setMarca("Marca");
        automovil.setModelo("Modelo");
        automovil.setNumeroSerie(getRandomNoSerie());

        return automovil;
    }

    public static List<Persona> consultaVehiculos() {
        DAO vehiculosDAO = new VehiculosDAO();
        return vehiculosDAO.getAll();
    }

    public static Optional consultaPrimerVehiculo() {
        DAO vehiculosDAO = new VehiculosDAO();
        return vehiculosDAO.get(1);
    }

    private static <T> void imprimirLista(List<T> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    public static String getRandomNumber(int digCount) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(digCount);
        for (int i = 0; i < digCount; i++) {
            sb.append((char) ('0' + rnd.nextInt(10)));
        }
        return sb.toString();
    }

}
