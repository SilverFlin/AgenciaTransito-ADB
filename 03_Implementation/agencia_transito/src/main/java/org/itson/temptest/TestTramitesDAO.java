/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.temptest;

import java.util.List;
import java.util.Optional;
import org.itson.daos.DAO;
import org.itson.daos.TramitesDAO;
import org.itson.dominio.Tramite;
import static org.itson.main.Main.imprimirLista;

/**
 *
 * @author Toled
 */
public class TestTramitesDAO {

    public static void probarTramitesDAO() {
        System.out.println("\nConsultar Tramites");
        imprimirLista(consultaTramites());
        System.out.println("\nConsultar tramite id=1:");
        System.out.println(consultaPrimerTramite());
    }


    private static List<Tramite> consultaTramites() {
        DAO tramitesDAO = new TramitesDAO();
        return tramitesDAO.getAll();
    }

    private static Optional consultaPrimerTramite() {
        DAO tramitesDAO = new TramitesDAO();
        return tramitesDAO.get(1);
    }
}
