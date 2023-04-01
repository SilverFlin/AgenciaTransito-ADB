/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.temptest;

import java.util.List;
import java.util.Optional;
import org.itson.interfaces.DAO;
import org.itson.daos.VehiculosDAOImpl;
import org.itson.dominio.Automovil;
import org.itson.dominio.Persona;
import org.itson.dominio.Vehiculo;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.VehiculosDAO;
import static org.itson.main.Main.getRandomNumber;
import static org.itson.main.Main.imprimirLista;

/**
 *
 * @author Toled
 */
public class TestVehiculosDAO {

    public static void probarVehiculosDAO() {
        System.out.println("Agregar Vehiculo falso:");
        agregaVehiculoFalso();
        System.out.println("\nConsultar Vehiculos");
        imprimirLista(consultaVehiculos());
        System.out.println("\nConsultar vehiculo id=1:");
        System.out.println(consultaPrimerVehiculo());
    }

    private static String getRandomNoSerie() {
        return getRandomNumber(17);
    }

    private static Vehiculo agregaVehiculoFalso() {

        Vehiculo vehiculo = crearVehiculoFalso();
        VehiculosDAO vehiculosDAO = new VehiculosDAOImpl();
        try {
            return (Vehiculo) vehiculosDAO.save(vehiculo);
        } catch (PersistenciaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    private static Vehiculo crearVehiculoFalso() {
        Vehiculo automovil = new Automovil();
        automovil.setColor("Azul");
        automovil.setLinea("Linea");
        automovil.setMarca("Marca");
        automovil.setModelo("Modelo");
        automovil.setNumeroSerie(getRandomNoSerie());

        return automovil;
    }

    private static List<Vehiculo> consultaVehiculos() {
        VehiculosDAO vehiculosDAO = new VehiculosDAOImpl();
        return vehiculosDAO.getAll();
    }

    private static Optional consultaPrimerVehiculo() {
        VehiculosDAO vehiculosDAO = new VehiculosDAOImpl();
        return vehiculosDAO.get(1);
    }

}
