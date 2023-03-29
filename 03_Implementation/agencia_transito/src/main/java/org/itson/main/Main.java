/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import java.util.List;
import org.itson.daos.PersonasDAO;
import org.itson.dominio.Persona;

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        consultaConDaoJPQL();
    }

    public static void consultaConDaoJPQL() {
        List<Persona> personas = PersonasDAO.buscar();
        imprimirLista(personas);

    }

    private static <T> void imprimirLista(List<T> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
